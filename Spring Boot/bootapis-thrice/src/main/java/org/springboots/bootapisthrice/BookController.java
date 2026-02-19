package org.springboots.bootapisthrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/add")
    public Book add(@RequestBody Book b) {
        return service.saveBook(b);
    }

    @GetMapping("/all")
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String del(@PathVariable int id) {
        service.delete(id); return "Deleted " + id;
    }

    @PutMapping("/{id}")
    public Book up(@PathVariable int id, @RequestBody Book b) {
        return service.update(id, b);
    }

}



/*

How will this work?

@RestController : This makes your class an API endpoint which returns JSON data.

@RequestBody : This converts the JSON data sent from Postman into a Book object.

Dynamic Storage : Every time we hit / add, the data will be directly inserted into the MySQL table.

*/
