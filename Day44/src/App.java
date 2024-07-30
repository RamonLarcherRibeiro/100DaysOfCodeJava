import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import classes.JdbcUserRepository;
import classes.User;
import classes.UserRepository;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
            UserRepository userRepository = new JdbcUserRepository(connection);

            // Criar um novo usuário
            User user = new User();
            user.setName("ramon larcher");
            user.setEmail("example.gmail.com");
            userRepository.save(user);

            // Encontrar um usuário por ID
            Optional<User> foundUser = userRepository.findById(user.getId());
            foundUser.ifPresent(u -> System.out.println("Usuário encontrado: " + u.getName()));

            // Listar todos os usuários
            userRepository.findAll().forEach(u -> System.out.println(u.getName()));

            // Deletar um usuário por ID
            userRepository.deleteById(user.getId());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
