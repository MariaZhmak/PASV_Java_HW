package homeWork.dataBase;

import homeWork.entities.Book;
import homeWork.enums.Genre;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBBook {

    public static void main(String[] args) throws SQLException {

        String dbUser = "postgres";
        String dbPassword = "Moremore";
        String dbUrl = "jdbc:postgresql://localhost:5432/books";
        String dbDriver = "org.postgresql.Driver";

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
//            System.out.println("SUCCESS" + conn);  // Проверка, что соединение успешно прошло
            Statement statement = conn.createStatement();
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS books_list (\n" +
//                    "id SERIAL NOT NULL PRIMARY KEY,\n" +
//                    "title VARCHAR(100),\n" +
//                    "author VARCHAR(100),\n" +
//                    "year INTEGER NOT NULL,\n" +
//                    "genre VARCHAR(100),\n" +
//                    "is_issued VARCHAR(100)\n" +
//                    ");");
//
//            statement.executeUpdate("INSERT INTO books_list (title, author, year, genre, is_issued)\n" +
//                    "VALUES ('To Kill a Mockingbird', 'Harper Lee', '1960', 'DRAMA', 'True'),\n" +
//                    "('1984', 'George Orwell', '1949', 'DRAMA', 'True'),\n" +
//                    "('The Great Gatsby', 'F. Scott Fitzgerald', '1925', 'NOVEL', 'True'),\n" +
//                    "('Lolita', 'Vladimir Nabokov', '1955', 'NOVEL', 'True'),\n" +
//                    "('Invisible Man', 'Ralph Ellison', '1952', 'NOVEL', 'True'),\n" +
//                    "('Infinite Jest', 'David Foster Wallace', '1996', 'NOVEL', 'True'),\n" +
//                    "('Mort', 'Terry Pratchett', '1987', 'COMEDY', 'True'),\n" +
//                    "('Catch-22', 'by Joseph Heller ', '1961', 'COMEDY', 'True'),\n" +
//                    "('Snow Crash', 'Neal Stephenson', '1992', 'NOVEL', 'True');");

            // Распечатывает результат в консоле
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM books_list");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id"));
//                System.out.println(resultSet.getString("title"));
//                System.out.println(resultSet.getString("author"));
//                System.out.println(resultSet.getInt("year"));
//                System.out.println(resultSet.getString("genre"));
//                System.out.println(resultSet.getString("is_issued"));
//                System.out.println("======================================================================");
//            }

            ResultSet resultSet = statement.executeQuery("SELECT * FROM books_list");

            List<Book> bookShelfs = new ArrayList<>();

            while (resultSet.next()) {
                Book bookShelf = new Book();
                bookShelf.setBookId(resultSet.getInt("id"));
                bookShelf.setTitle(resultSet.getString("title"));
                bookShelf.setAuthor(resultSet.getString("author"));
                bookShelf.setYear(resultSet.getInt("year"));
                bookShelf.setGenre(Genre.valueOf(resultSet.getString("genre")));
                bookShelf.setIssued(Boolean.parseBoolean(resultSet.getString("is_issued")));
                bookShelfs.add(bookShelf);
            }
            bookShelfs.forEach(System.out::println);

        }
    }
}
