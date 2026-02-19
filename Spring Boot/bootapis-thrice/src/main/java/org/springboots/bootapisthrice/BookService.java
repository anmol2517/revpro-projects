package org.springboots.bootapisthrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public Book saveBook(Book b) {
        return repo.save(b);
    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public Book update(int id, Book b) {
        Book old = repo.findById(id).orElse(null);
        if(old != null) {
            old.setTitle(b.getTitle());
            old.setAuthor(b.getAuthor());
            old.setPrice(b.getPrice());
            return repo.save(old);
        }
        return null;
    }
}


/*

BookService is the Brain of your application. It handles business logic and works like a bridge between the Controller and the Database.

@Service : This tells Spring that this class will handle business logic and Spring should create a Bean (object) for it.

@Autowired : This automatically injects BookRepository so we can use database methods.

saveBook(book) : This permanently saves the data coming from Postman into the database.

findAll() / findById(id) : These are used to fetch all data or a specific data by ID from the database.

deleteById(id) : This dynamically deletes data from the database.

*/
