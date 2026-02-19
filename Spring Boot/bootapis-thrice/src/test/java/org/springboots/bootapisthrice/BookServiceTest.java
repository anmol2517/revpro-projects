package org.springboots.bootapisthrice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BookService bookService;

    @Test
    void testAddBook() throws Exception {
        Book book = new Book(1, "JUnit Guide", "Test Author", 500.0);
        when(bookService.saveBook(any(Book.class))).thenReturn(book);

        mockMvc.perform(post("/books/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"title\":\"JUnit Guide\",\"author\":\"Test Author\",\"price\":500.0}"))
                .andExpect(status().isOk());
    }
}


/*

This code is a unit test to test your Spring Boot API, where the API behavior is checked without starting the server.

Annotation-wise Explanation:

@SpringBootTest : This loads the complete Spring Application Context so the test runs like a real environment.

@AutoConfigureMockMvc : This configures and injects MockMvc, which is used to simulate HTTP requests.

@MockitoBean : This creates a fake (mock) object of BookService, so during testing the database is not accessed and we can control the service behavior.

Method Flow: testAddBook()

Mocking Phase :
when(bookService.saveBook(any(Book.class))).thenReturn(book);
This tells the service that whenever someone tries to save a book, return this dummy book object without checking the database.

Execution Phase :
mockMvc.perform(post("/books/add")...)
This sends a POST request to the /books/add endpoint with JSON data (title, author, price).

Assertion Phase :
.andExpect(status().isOk())
This verifies whether the API returned 200 OK response or not.

*/
