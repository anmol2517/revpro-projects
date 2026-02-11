package org.example.autowiring;

public class Book {
    private String title;
    private String author;

    public Book() {}
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}

