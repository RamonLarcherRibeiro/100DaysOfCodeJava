package com.day50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import com.day50.classes.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mydatabase";
        String user = "ramon";
        String password = "senha";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            UserGateway userGateway = new UserGateway(connection);

            // Inserir novo user
            User newUser = new User();
            newUser.setName("Ramon Larcher");
            newUser.setEmail("meuemail.com");
            userGateway.insert(newUser);

            // Buscar pelo ID
            User userFromDb = userGateway.findById(newUser.getId());
            System.out.println("Found user: " + userFromDb.getName());

            // Atualizar user
            userFromDb.setEmail("meuemail.com");
            userGateway.update(userFromDb);

            // Deletar
            userGateway.delete(userFromDb.getId());

            // Buscar todos os users
            List<User> allUsers = userGateway.findAll();
            for (User u : allUsers) { // Renomeei 'user' para 'u' aqui
                System.out.println("User: " + u.getName() + ", Email: " + u.getEmail());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
