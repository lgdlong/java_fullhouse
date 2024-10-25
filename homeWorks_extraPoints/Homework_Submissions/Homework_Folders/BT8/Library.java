package Bai_2_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void showAllBooks() {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    private boolean isIdExist(Book newBook) {
        for (Book book : bookList) {
            if (newBook.getId().equalsIgnoreCase(book.getId())) {
                return true; // Found a book with the same ID
            }
        }
        return false; // No book with the same ID found
    }

    public void addBook (Book book) {

        boolean isBlankOrEmpty = book.getId().isEmpty() || book.getId().isBlank();

        if (!isBlankOrEmpty && !isIdExist(book)) {
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
                System.out.printf("Book ID %s update successfully!\n", book.getId());

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
            System.out.printf("Book ID %s remove successfully!\n", id);
        } else {
            System.out.printf("Book ID %s not found!\n", id);
        }
    }

    public Book searchBookById(String id) throws BookNotFoundException {
        for (Book book : bookList) {
            if (id.equalsIgnoreCase(book.getId())) {
                return book;
            }
        }

        // Throw exception if no student found with a given ID
        throw new Library.BookNotFoundException("Book ID " + id + " not found.");
    }

    public ArrayList<Book> searchBookListByPublicationDateInRange(String dateFrom, String dateTo) {
        ArrayList<Book> booksInRange = new ArrayList<>();

        boolean hasBook = false; // Set a flag check hasBook for notification

        // Convert String to Date format
        LocalDate dateStart = setDate(dateFrom);
        LocalDate dateEnd = setDate(dateTo);

        for (Book book : bookList) {
            LocalDate date = setDate(book.getPublicationDate()); // Convert String to Date format

            // Check if: dateFrom < date < dateTo
            boolean isPublicationDateInRange = date.isAfter(dateStart) && date.isBefore(dateEnd);

            if (isPublicationDateInRange) {
                booksInRange.add(book); // Add a book to the list

                if (!hasBook) hasBook = true; // The Flag is true if it has a book
            }
        }

        if (!hasBook) {
            System.out.printf("There is no book found from %s to %s!\n", dateFrom, dateTo);
        }

        return booksInRange;
    }

    public ArrayList<Book> searchBookListByCategoryName(String categoryName) {
        ArrayList<Book> list = new ArrayList<>();

        boolean hasBook = false;

        for (Book book : bookList) {
            if (categoryName.equalsIgnoreCase(book.getCategoryName())) {
                list.add(book);

                if (!hasBook) hasBook = true; // The Flag is true if it has a book
            }
        }

        if (!hasBook) {
            System.out.printf("There is no book found with category name %s!\n", categoryName);
        }

        return list;
    }

    public ArrayList<Book> searchBookListByAuthorName(String authorName) {
        ArrayList<Book> list = new ArrayList<>();

        boolean hasBook = false;

        for (Book book : bookList) {
            if (authorName.equalsIgnoreCase(book.getAuthorName())) {
                list.add(book);

                if (!hasBook) hasBook = true; // The Flag is true if it has a book
            }
        }

        if (!hasBook) {
            System.out.printf("There is no book found with author name %s!\n", authorName);
        }

        return list;
    }

    public ArrayList<Book> searchBookListByPriceInRange(double minPrice, double maxPrice) {
        ArrayList<Book> list = new ArrayList<>();

        boolean hasBook = false;

        for (Book book : bookList) {
            boolean isPriceInRange = minPrice <= book.getPrice() && book.getPrice() <= maxPrice;

            if (isPriceInRange) {
                list.add(book);

                if (!hasBook) hasBook = true; // The Flag is true if it has a book
            }
        }

        if (!hasBook) {
            System.out.printf("There is no book found with price in range %s to %s!\n", minPrice, maxPrice);
        }

        return list;
    }

    public ArrayList<Book> searchBookListByDiscountRateInRange(double minDiscountRate, double maxDiscountRate) {
        ArrayList<Book> list = new ArrayList<>();

        boolean hasBook = false;

        for (Book book : bookList) {
            boolean isDiscountRateInRange = minDiscountRate <= book.getDiscountRate() && book.getDiscountRate() <= maxDiscountRate;

            if (isDiscountRateInRange) {
                list.add(book);

                if (!hasBook) hasBook = true; // The Flag is true if it has a book
            }
        }

        if (!hasBook) {
            System.out.printf("There is no book found with discount rate in range %s to %s!\n", minDiscountRate, maxDiscountRate);
        }

        return list;
    }


    public static class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message); // Pass custom message to Exception class
        }
    }

    public static LocalDate setDate(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");

        return LocalDate.parse(dob, formatter);
    }
}





























