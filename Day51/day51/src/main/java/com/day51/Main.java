package com.day51;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.day51.classes.ProductGateway;

public class Main {
    public static void main(String[] args) {
        int productId = 1; // id do produto 
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/mydatabase";
            String user = "ramon";
            String password = "senha";
            connection = DriverManager.getConnection(url, user, password);

            ProductGateway productGateway = new ProductGateway(productId, connection);

            //leitura
            System.out.println("Nome do produto: " + productGateway.getProductName());
            System.out.println("Preço do produto: " + productGateway.getProductPrice());

            //  atualização
            productGateway.setProductName("Novo Nome do Produto");
            productGateway.setProductPrice(99);
            productGateway.update();

            // xclusão
            productGateway.delete();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}