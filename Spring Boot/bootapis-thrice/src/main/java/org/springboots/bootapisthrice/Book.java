package org.springboots.bootapisthrice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private double price;
}


/*

Lombok is used in our Book.java therefore we don’t need to manually write getters, setters, constructors, or toString().

@Data : This annotation automatically generates getters, setters, equals(), hashCode(), and toString() for all fields.

@NoArgsConstructor : This generates a default (empty) constructor.

@AllArgsConstructor : This generates a constructor with all fields.

When we compile the code Lombok adds all of these in the background automatically which keeps your code clean and shorter.

*/