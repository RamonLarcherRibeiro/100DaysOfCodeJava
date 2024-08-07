package com.day50.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase"; // URL do seu banco de dados PostgreSQL
    private static final String USER = "postgres"; // Usuário do PostgreSQL
    private static final String PASSWORD = "password"; // Senha do PostgreSQL

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
