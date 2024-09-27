package homeWork.services;

import homeWork.entities.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    User getUserByEmail(String email);
    List<User> getUsers();


}
