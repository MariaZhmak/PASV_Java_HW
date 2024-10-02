package homeWork.entities;

import homeWork.enums.Status;

import java.time.LocalDate;

public class User {
    int userId;
    String firstName;
    String lastName;
    String email;
    LocalDate registeredDate;  // Дата регистрации
    Status status;

    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User(String firstName, String lastName, String email, LocalDate registeredDate, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registeredDate = registeredDate;
        this.status = status;
    }

    public User(int userId, String firstName, String lastName, String email, LocalDate registeredDate, Status status) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registeredDate = registeredDate;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", registeredDate=" + registeredDate + '\''+
                ", status='" + status +
                '}';
    }
}

