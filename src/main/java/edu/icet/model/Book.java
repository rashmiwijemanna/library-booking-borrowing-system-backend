package edu.icet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private int availableCopies;
}
