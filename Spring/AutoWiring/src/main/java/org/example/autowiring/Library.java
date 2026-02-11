package org.example.autowiring;


public class Library {
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Book book7;
    private Book book8;
    private Student student1;

    public Library() {}

    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public void setBook2(Book book2) {
        this.book2 = book2;
    }

    public void setBook3(Book book3) {
        this.book3 = book3;
    }

    public void setBook4(Book book4) {
        this.book4 = book4;
    }

    public void setBook5(Book book5) {
        this.book5 = book5;
    }

    public void setBook6(Book book6) {
        this.book6 = book6;
    }

    public void setBook7(Book book7) {
        this.book7 = book7;
    }

    public void setBook8(Book book8) {
        this.book8 = book8;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    @Override
    public String toString() {
        return "Library {\n" +
                "  " + book1 + ",\n" +
                "  " + book2 + ",\n" +
                "  " + book3 + ",\n" +
                "  " + book4 + ",\n" +
                "  " + book5 + ",\n" +
                "  " + book6 + ",\n" +
                "  " + book7 + ",\n" +
                "  " + book8 + "\n" +
                '}';
    }
}