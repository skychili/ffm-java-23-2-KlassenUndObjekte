package org.example;

public class Book {

    String title;
    String author;
    int pageCount;
    String isbn;
    String publisher;
    String genre;


    public Book(){
    }

    public Book(String bookTitle, String author){
        this.title = bookTitle;
        this.author = author;
    }

    public Book(String currywurst, String author, String isbn){
        this.title = currywurst;
        this.isbn = isbn;
        this.author = author;
    }

    

}
