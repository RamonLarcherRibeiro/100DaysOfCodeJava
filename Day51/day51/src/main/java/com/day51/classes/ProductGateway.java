package com.day51.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductGateway {
    private Connection connection;
    private int productId;
    private String productName;
    private double productPrice;

    public ProductGateway(int productId, Connection connection) {
        this.productId = productId;
        this.connection = connection;
        load();
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    private void load() {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "SELECT name, price FROM products WHERE id = ?");
            statement.setInt(1, productId);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                productName = rs.getString("name");
                productPrice = rs.getDouble("price");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "UPDATE products SET name = ?, price = ? WHERE id = ?");
            statement.setString(1, productName);
            statement.setDouble(2, productPrice);
            statement.setInt(3, productId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM products WHERE id = ?");
            statement.setInt(1, productId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
