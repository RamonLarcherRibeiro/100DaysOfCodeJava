package classes;


import java.util.List;

public class UserService {
    private UserDao userDao = new UserDaoImpl();

    public void createUser(String name, String email) {
        User user = new User(0, name, email);
        userDao.addUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUser(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public void updateUser(int id, String name, String email) {
        User user = new User(id, name, email);
        userDao.updateUser(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
