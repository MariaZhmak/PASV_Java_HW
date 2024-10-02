package homeWork;

import homeWork.entities.Book;
import homeWork.entities.User;
import homeWork.enums.Genre;
import homeWork.enums.Status;
import homeWork.services.BookService;
import homeWork.services.LibraryService;
import homeWork.services.UserService;
import homeWork.services.impl.BookServiceImpl;
import homeWork.services.impl.LibraryServiceIml;
import homeWork.services.impl.UserServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Runner {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookService bookService = new BookServiceImpl();
    private static final UserService userService = new UserServiceImpl();
    private static final LibraryService libraryService = new LibraryServiceIml();

    public static void main(String[] args) {

        System.out.println("Welcome to library");
        System.out.println("=============================================");
        System.out.println();
        startMenu();
    }


    public static void startMenu() {
        System.out.println("""
                CHOOSE AN ACTION:
                1 - Add a book
                2 - Get all books
                3 - Delete a book
                4 - Find a book
                5 - Register a user
                6 - Issue a book to a user
                7 - Return a book
                8 - Get all users
                9 - Exit
                """);

        int choose = scanner.nextInt();

        switch (choose) {
            case 1 -> addBook();
            case 2 -> getAllBooks();
            case 3 -> deleteBook();
            case 4 -> findBook();
            case 5 -> addUser();
            case 6 -> issue();
            case 8 -> getUsers();
            case 9 -> exit();
            default -> {
                System.out.println("Wrong choose. Try again");
                startMenu();
            }
        }
    }

    private static void addBook() {

        scanner.nextLine();
        System.out.println("Enter the title:");
        String title = scanner.nextLine();
        System.out.println("Enter the author:");
        String author = scanner.nextLine();
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        System.out.println("Enter the genre:");
        Arrays.stream(Genre.values()).forEach(System.out::println);
        scanner.nextLine();
        String genreStr = scanner.nextLine();
        Genre genre = Genre.valueOf(genreStr.toUpperCase());

        bookService.addBook(new Book(title, author, year, genre, false));
        String book = String.valueOf(new Book());
        System.out.println("Book created!");
        System.out.println("=============================================");
        startMenu();
    }


    private static void getAllBooks() {
        bookService.getBooks();
        System.out.println(bookService.getBooks());

        System.out.println("=============================================");
        startMenu();
    }


    private static void deleteBook() {
        scanner.nextLine();
        System.out.println("Enter the id of the book to delete:");
        int bookId = scanner.nextInt();
        bookService.deleteBook(bookId);
        System.out.println("The book deleted");

        System.out.println("=============================================");
        startMenu();
    }


    private static void findBook() {
        System.out.println("""
                CHOOSE AN ACTION:
                11 - Find a book by title
                12 - Find a book by author
                14 - Find a book by year
                15 - Find a book by genre
                16 - Return to Menu
                """);
        int chooseFindBook = scanner.nextInt();
        switch (chooseFindBook) {
            case 11 -> findBookByTitle();
            case 12 -> findBookByAuthor();
            case 14 -> findBookByYear();
            case 15 -> findBookByGenre();
            case 16 -> returnToMenu();

            default -> {
                System.out.println("Wrong choose. Try again");
                findBook();
            }
        }
    }


    private static void findBookByTitle() {
        scanner.nextLine();
        System.out.println("Enter the title");
        String titleFind = scanner.nextLine();
        bookService.findBookByTitle(titleFind);
        if (titleFind != null) {
            System.out.println("The book found: " + bookService.getBooksByTitle(titleFind));
        } else {
            System.out.println("The book nod found");
        }
        System.out.println("=============================================");
        startMenu();
    }

    private static void findBookByAuthor() {
        scanner.nextLine();
        System.out.println("Enter the author");
        String authorFind = scanner.nextLine();
        bookService.findBookByAuthor(authorFind);
        if (authorFind != null) {
            System.out.println("The book found: " + bookService.getBooksByAuthor(authorFind));
        } else {
            System.out.println("The book nod found");
        }
        System.out.println("=============================================");
        startMenu();
    }

    private static void findBookByYear() {
        scanner.nextLine();
        System.out.println("Enter the year");
        int yearFind = scanner.nextInt();
        bookService.findBookByYear(yearFind);
        if (yearFind != 0) {
            System.out.println("The book found: " + bookService.getBooksByYear(yearFind));
        } else {
            System.out.println("The book nod found");
        }
        System.out.println("=============================================");
        startMenu();
    }

    private static void findBookByGenre() {
        scanner.nextLine();
        System.out.println("Enter the genre");
        String genreFind = scanner.nextLine();  // Если вводить разным регистром?
        bookService.findBookByGenre(genreFind);
        if (genreFind != null) {
            System.out.println("The book found: " + bookService.getBooksByGenre(genreFind));
        } else {
            System.out.println("The book nod found");
        }
        System.out.println("=============================================");
        startMenu();
    }

    public static void addUser() {
        scanner.nextLine();
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        userService.addUser(new User(firstName, lastName, email));
        String user = String.valueOf(new User());
        System.out.println("User registered!");
        System.out.println("=============================================");
        startMenu();
    }
    public static void issue() {
        scanner.nextLine();
        System.out.println("Enter the first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter the second name");
        String secondName = scanner.nextLine();
        System.out.println("Enter the email");
        String email = scanner.nextLine();

        System.out.println("=============================================");
        startMenu();
    }
public static void getUsers(){
    userService.getUsers();
    System.out.println(userService.getUsers());

    System.out.println("=============================================");
    startMenu();
}

    public static void exit() {
        scanner.close();
        System.out.println("Goodbye");
    }

    public static void returnToMenu() {
        System.out.println("=============================================");
        startMenu();
    }
}
