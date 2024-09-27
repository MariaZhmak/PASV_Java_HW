package homeWork.services;

import homeWork.entities.Book;
import homeWork.entities.User;

import java.util.List;

public interface LibraryService {
    //    void issueBook(int bookId, int userId);

    //    void returnBook(int userId, int bookId);
    void issueBook(Book book, User user);
    void returnBook(Book book, User user);

    List<Book> getListBookTitle(String title);

    List<User> getListUserId(int userId);

    void exit();

    void returnToMenu();

}
