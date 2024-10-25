package Bai_2_5;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("B01", "Book A", "06/01/2023", "Action", "Author A", 50.79, 0.2));
        library.addBook(new Book("B02", "Book B", "07/02/2023", "Horror", "Author B", 79.89, 0.1));
        library.addBook(new Book("B03", "Book C", "08/03/2023", "Romance", "Author A", 25.99, 0.3));
        library.addBook(new Book("B04", "Book D", "09/04/2023", "Action", "Author B", 67.88, 0.15));
        library.addBook(new Book("B05", "Book E", "10/05/2023", "Romance", "Author C", 55.59, 0.0));
        library.addBook(new Book("B06", "Book F", "20/02/2024", "Horror", "Author C", 50.99, 0.35));
        library.addBook(new Book("B07", "Book G", "11/03/2024", "Adventure", "Author A", 89.99, 0.3));
        library.addBook(new Book("B08", "Book H", "09/04/2024", "Adventure", "Author D", 87.48, 0.45));
        library.addBook(new Book("B09", "Book K", "06/05/2024", "Horror", "Author D", 45.54, 0.5));
        System.out.println("Library after adding 9 books:");
        library.showAllBooks();

        System.out.println("----------------------------------------------------------");

        ArrayList<Book> bookList1 = library.searchBookListByPublicationDateInRange("10/04/2023", "10/03/2024");
        System.out.println("Books have publication date from 10/04/2023 to 10/03/2024:");
        for (Book book : bookList1) {
            System.out.println(book);
        }

        System.out.println("----------------------------------------------------------");

        ArrayList<Book> bookList2 = library.searchBookListByCategoryName("Action");
        System.out.println("Books have category name by Action:");
        for (Book book : bookList2) {
            System.out.println(book);
        }

        System.out.println("----------------------------------------------------------");

        ArrayList<Book> bookList3 = library.searchBookListByAuthorName("Author D");
        System.out.println("Books have author name by Author D:");
        for (Book book : bookList3) {
            System.out.println(book);
        }

        System.out.println("----------------------------------------------------------");

        ArrayList<Book> bookList4 = library.searchBookListByPriceInRange(50, 80);
        System.out.println("Books have price from 50 to 80:");
        for (Book book : bookList4) {
            System.out.println(book);
        }

        System.out.println("----------------------------------------------------------");

        ArrayList<Book> bookList5 = library.searchBookListByDiscountRateInRange(0.2, 0.4);
        System.out.println("Books have discount rate from 0.2 to 0.4:");
        for (Book book : bookList5) {
            System.out.println(book);
        }

    }
}
