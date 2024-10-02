package homeWork.entities;

import homeWork.enums.Genre;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int year;
    private Genre genre;
    private boolean isIssued;  // Флаг, указывающий выдана ли книга
    private int bookUserId;     // ID пользователя кому выдана книга

    public Book() {
    }

    public Book(String title, String author, int year, Genre genre, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isIssued = false;
    }

    public Book(int bookId, String title, String author, int year, Genre genre, boolean isIssued) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", available=" + isIssued +
                '}';
    }
}
