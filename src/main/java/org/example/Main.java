package org.example;

public class Main {
    public static void main(String[] args) {

        Book mariannasBook = new Book();
        Book thorstensBook = new Book();
        Book sarasBook = new Book("Whatever", "John Doe", "123");

        mariannasBook.title = "Sprachkurs Plus - Hindi";
        mariannasBook.author = "unbekannt";
        mariannasBook.pageCount = 240;
        mariannasBook.isbn = "978-3-589-01519-1";
        mariannasBook.publisher = "Cornelsen";
        mariannasBook.genre = "Fachbuch";


        System.out.println(mariannasBook.title);
        System.out.println(mariannasBook.author);
        System.out.println(mariannasBook.pageCount);


        thorstensBook.title = "How emotions are made";
        thorstensBook.author = "Lisa Feldman-Barrett";
        thorstensBook.pageCount = 425;
        thorstensBook.isbn = "978-1509837526";

        System.out.println(thorstensBook.title);
        System.out.println(sarasBook.title);




    }
}