package com.day49;

import com.day49.classes.User;

public class Main {
    public static void main(String[] args) {
        // Criar um novo usuário
        User newUser = new User("John Doe", "john.doe@example.com");
        newUser.save();
        System.out.println("User saved with ID: " + newUser.getId());

        // Buscar um usuário pelo ID
        User user = User.find(newUser.getId());
        if (user != null) {
            System.out.println("User found: " + user.getName() + " - " + user.getEmail());
        }

        // Atualizar um usuário
        user.setName("John Smith");
        user.update();
        System.out.println("User updated.");

        // Deletar um usuário
        user.delete();
        System.out.println("User deleted.");
    }
    
}
