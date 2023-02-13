package com.isidora.bookrepository.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "titles")
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "year")
    private String year;
    @Column(name = "genre")
    private String genre;
    @Column(name = "author")
    private String author;

    public Title() {

    }
    public Title(String titleName, String yearPublished, String genre, String author) {
        this.isbn = isbn;
        this.name = titleName;
        this.year = yearPublished;
        this.genre = genre;
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String titleName) {
        this.name = titleName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String yearPublished) {
        this.year = yearPublished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
