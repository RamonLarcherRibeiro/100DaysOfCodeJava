package classes;
import java.util.List;

import classes.*;
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(Long id) {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public void createUser(User user) {
        userService.createUser(user);
    }

    public void updateUser(User user) {
        userService.updateUser(user);
    }

    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
}
