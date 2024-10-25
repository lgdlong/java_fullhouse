package Bai_2_5;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void showAllBooks() {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public void addBook (Book book) {
        if (!book.getId().isEmpty() && !book.getId().isBlank()) {
            bookList.add(book);
        }
    }

    public void updateBook(Book book) {
        boolean found = false;

        for (Book b : bookList) {
            if (book.getId().equalsIgnoreCase(b.getId())) { // Found ID to update details
                b.setName(book.getName());
                b.setPublicationDate(book.getPublicationDate());
                b.setCategoryName(book.getCategoryName());
                b.setAuthorName(book.getAuthorName());
                b.setPrice(book.getPrice());
                b.setDiscountRate(book.getDiscountRate());

                found = true;
                System.out.printf("Book ID %s update successfully!", book.getId());

                break;
            }
        }

        if (!found) {
            System.out.println("ID do not exist!");
        }
    }

    public void removeBookById(String id) {
        boolean isRemoved = bookList.removeIf(book -> id.equalsIgnoreCase(book.getId()));

        if (isRemoved) {
            System.out.printf("Book ID %s remove successfully!", id);
        } else {
            System.out.printf("Book ID %s not found!", id);
        }
    }

    public Book searchBookById(String id) throws BookNotFoundException {
        for (Book book : bookList) {
            if (id.equalsIgnoreCase(book.getId())) {
                return book;
            }
        }

        // Throw exception if no student found with given ID
        throw new Library.BookNotFoundException("Book ID " + id + " not found.");
    }

    public static class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message); // Pass custom message to Exception class
        }
    }
}
