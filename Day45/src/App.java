import classes.User;
import classes.UserController;
import classes.UserRepository;
import classes.UserRepositoryImpl;
import classes.UserService;

public class App {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        User user = new User(1L, "ramon larcher", "ramon@gmail.com");
        userController.createUser(user);

        System.out.println(userController.getUser(1L));
    }
}
