package com.rev.taskmanager.Controller;

import com.rev.taskmanager.Model.Task;
import com.rev.taskmanager.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
@Tag(name = "Tasks", description = "Task management endpoints")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @Operation(summary = "Create new task", description = "Creates a new task and returns it")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Task created successfully",
                    content = @Content(schema = @Schema(implementation = Task.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @PostMapping
    public ResponseEntity<Task> createTask(
            @RequestBody Task task) {
        try {
            Task createdTask = taskService.createTask(task);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "Get all tasks", description = "Fetches all tasks from database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tasks fetched successfully"),
            @ApiResponse(responseCode = "204", description = "No tasks available", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        try {
            List<Task> tasks = taskService.getAllTasks();
            if (tasks.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(tasks);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "Get task by ID", description = "Fetches a single task using task ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task found",
                    content = @Content(schema = @Schema(implementation = Task.class))),
            @ApiResponse(responseCode = "404", description = "Task not found", content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(
            @Parameter(description = "Task ID", example = "1")
            @PathVariable Long id) {

        Optional<Task> taskData = taskService.getTaskById(id);

        return taskData
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Update task by ID", description = "Updates task details using ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task updated successfully",
                    content = @Content(schema = @Schema(implementation = Task.class))),
            @ApiResponse(responseCode = "404", description = "Task not found", content = @Content)
    })
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(
            @Parameter(description = "Task ID", example = "1")
            @PathVariable Long id,
            @RequestBody Task task) {

        Task updatedTask = taskService.updateTask(id, task);

        if (updatedTask != null) {
            return ResponseEntity.ok(updatedTask);
        }

        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Delete task by ID", description = "Deletes a task using ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Task deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Task not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(
            @Parameter(description = "Task ID", example = "1")
            @PathVariable Long id) {
        try {
            boolean deleted = taskService.deleteTask(id);
            if (deleted) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "Mark task as completed", description = "Marks a task as completed using ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Task marked as completed",
                    content = @Content(schema = @Schema(implementation = Task.class))),
            @ApiResponse(responseCode = "404", description = "Task not found", content = @Content)
    })
    @PatchMapping("/{id}/complete")
    public ResponseEntity<Task> markComplete(
            @Parameter(description = "Task ID", example = "1")
            @PathVariable Long id) {

        Task task = taskService.markComplete(id);

        if (task != null) {
            return ResponseEntity.ok(task);
        }

        return ResponseEntity.notFound().build();
    }

    @Operation(summary = "Get tasks by status", description = "Fetch tasks by completed status (true/false)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tasks fetched successfully"),
            @ApiResponse(responseCode = "204", description = "No tasks found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @GetMapping("/status/{completed}")
    public ResponseEntity<List<Task>> getTasksByStatus(
            @Parameter(description = "Task completed status", example = "true")
            @PathVariable boolean completed) {
        try {
            List<Task> tasks = taskService.getTasksByStatus(completed);
            if (tasks.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(tasks);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Operation(summary = "Search tasks", description = "Search tasks using keyword in title/description")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tasks fetched successfully"),
            @ApiResponse(responseCode = "204", description = "No tasks found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
    })
    @GetMapping("/search")
    public ResponseEntity<List<Task>> searchTasks(
            @Parameter(description = "Search keyword", example = "meeting")
            @RequestParam String keyword) {
        try {
            List<Task> tasks = taskService.searchTasks(keyword);
            if (tasks.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(tasks);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

