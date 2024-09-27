package homeWork.services.impl;

import homeWork.entities.Book;
import homeWork.entities.User;
import homeWork.services.BookService;
import homeWork.services.LibraryService;
import homeWork.services.UserService;

import java.util.*;

public class LibraryServiceIml implements LibraryService {

    private final BookService bookService = new BookServiceImpl();
    private final UserService userService = new UserServiceImpl();
    private Map<User, List<Book>> issuedBooks = new HashMap<>();

    @Override
    public void issueBook(Book book, User user) {
        if (book.isIssued()) {
        } else {
            if (issuedBooks.containsKey(user)) {
                List<Book> books = issuedBooks.get(user);
                books.add(book);
                issuedBooks.put(user, books);
            } else {
                issuedBooks.put(user, List.of(book));
            }
            book.setIssued(true);
        }
    }

    @Override
    public void returnBook(Book book, User user) {
        if (book.isIssued()) {
        } else {
            if (issuedBooks.containsKey(user)) {
                List<Book> books = issuedBooks.get(user);
                books.remove(book);
                issuedBooks.remove(user, books);
            } else {
                issuedBooks.remove(user, List.of(book));
            }
            book.setIssued(false);
        }
    }

//    @Override
//    public void issueBook(int bookId, int userId) {
//        Book bookById = bookService.getBookById(bookId);
//        if (Objects.nonNull(bookById)) {
//            bookById.setIssued(Boolean.FALSE);
//            bookById.setBookId(bookId);
//            bookService.updateBook(bookById);
//        }
//    }

//    @Override
//    public void returnBook(int userId, int bookId) {
//        Book returnBookById = bookService.returnBookById(bookId);
//        returnBookById.setIssued(Boolean.TRUE);
//        returnBookById.setBookId(bookId);
//        bookService.updateBook(returnBookById);
//    }

        @Override
        public List<Book> getListBookTitle (String title){
            return null;
        }

        @Override
        public List<User> getListUserId ( int userId){
            return null;
        }

        @Override
        public void exit () {
        }

        @Override
        public void returnToMenu () {
        }
    }



