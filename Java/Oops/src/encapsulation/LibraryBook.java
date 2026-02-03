package encapsulation;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    // Constructor
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false; // initially not issued
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Invalid title!");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author name!");
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn != null && !isbn.isEmpty()) {
            this.isbn = isbn;
        } else {
            System.out.println("Invalid ISBN!");
        }
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if(!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void returnBook() {
        if(isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Issued: " + isIssued);
    }
}
