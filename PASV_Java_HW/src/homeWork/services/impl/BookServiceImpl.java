package homeWork.services.impl;

import homeWork.entities.Book;
import homeWork.enums.Genre;
import homeWork.services.BookService;

import java.util.*;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private final List<Book> books = new ArrayList<>();

    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "books=" + books +
                '}';
    }

    @Override
    public void addBook(Book book) {
        Book book1 = books.stream().max(Comparator.comparing(Book::getBookId)).orElse(null);
        int bookId = 1;
        if (Objects.nonNull(book1)) {
            bookId = book1.getBookId() + 1;
        }
        book.setBookId(bookId);
        books.add(book);
    }

    @Override
    public void updateBook(Book book) {
        if (Objects.nonNull(book)) {
            books.removeIf(i -> i.getBookId() == book.getBookId());
            books.add(book);
        }
    }

    @Override
    public void deleteBook(int bookId) {
        books.removeIf(i -> i.getBookId() == bookId);
    }

    @Override
    // my note
    public Book getBookById(int bookId) {
        return books.stream().filter(i -> i.getBookId() == bookId).findFirst().orElse(null);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book getBooksByTitle(String titleFind) {
        return books.stream().filter(i -> i.getTitle().equals(titleFind)).findFirst().orElse(null);
    }

    @Override
    public List<Book> getBooksByAuthor(String authorFind) {
        return books.stream().filter(i -> i.getAuthor().equals(authorFind)).toList();
    }

    @Override
    public List<Book> getBooksByYear(int yearFind) {
        return books.stream().filter(i -> i.getYear() == yearFind).toList();
    }

    @Override
    public List<Book> getBooksByGenre(String genreFind) {
        return books.stream().filter(i -> i.getGenre() == Genre.valueOf(genreFind)).toList();
    }

    @Override
    public List<Book> findBook() {
        return books;
    }

    @Override
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findBookByYear(int year) {
        for (Book book : books) {
            if (book.getYear() == year) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findBookByGenre(String genre) {
        for (Book book : books) {
            if (book.getGenre() == Genre.valueOf(genre)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book returnBookById(int bookId) {
        return null;
    }


}
