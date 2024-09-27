package homeWork.services;

import homeWork.entities.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void updateBook(Book book);

    void deleteBook(int bookId);

    Book getBookById(int bookId);

    List<Book> getBooks();
    Book getBooksByTitle(String titleFind);
    List<Book> getBooksByAuthor(String authorFind);
    List<Book> getBooksByYear(int yearFind);
    List<Book> getBooksByGenre(String genreFind);

    List<Book> findBook();

    Book findBookByTitle(String title);

    Book findBookByAuthor(String author);

    Book findBookByYear(int year);

    Book findBookByGenre(String genre);

    Book returnBookById(int bookId);


}
