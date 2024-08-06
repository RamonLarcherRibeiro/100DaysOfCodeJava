package com.day49.classes;

import java.sql.*;

public class User {
    private int id;
    private String name;
    private String email;

    // Construtor sem argumentos
    public User() {}

    // Construtor com argumentos
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter para 'id'
    public int getId() {
        return id;
    }

    // Setter para 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter para 'name'
    public String getName() {
        return name;
    }

    // Setter para 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter para 'email'
    public String getEmail() {
        return email;
    }

    // Setter para 'email'
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para salvar o usuário (Create)
    public void save() {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, this.name);
            pstmt.setString(2, this.email);
            pstmt.executeUpdate();

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    this.id = generatedKeys.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para encontrar um usuário pelo ID (Read)
    public static User find(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setEmail(rs.getString("email"));
                    return user;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para atualizar um usuário (Update)
    public void update() {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, this.name);
            pstmt.setString(2, this.email);
            pstmt.setInt(3, this.id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para deletar um usuário (Delete)
    public void delete() {
        String sql = "DELETE FROM users WHERE id = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, this.id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
