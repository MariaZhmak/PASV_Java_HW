package homeWork.services.impl;

import homeWork.entities.User;
import homeWork.services.UserService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {
    private final List<User> users = new ArrayList<>();



    @Override
    public void addUser(User user) {
        User user1 = users.stream().max(Comparator.comparing(User::getUserId)).orElse(null);
        int userId = 1;
        if (Objects.nonNull(user1)) {
            userId = user1.getUserId() + 1;
        }
        user.setUserId(userId);
        users.add(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void updateUser(User user) {
        if (Objects.nonNull(user)) {
            users.removeIf(user1 -> user1.getUserId() == user.getUserId());
            users.add(user);
        }
    }

    @Override
    public void deleteUser(int userId) {
        users.removeIf(it -> it.getUserId() == userId);

    }
}
