package com.day43;

import com.day43.classes.User;
import com.day43.classes.UserDTO;
import com.day43.classes.UserMapper;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto User
        User user = new User(1L, "John Doe", "john.doe@example.com");

        // Converter User para UserDTO usando o UserMapper
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);

        // Imprimir os detalhes do UserDTO
        System.out.println("UserDTO ID: " + userDTO.getId());
        System.out.println("UserDTO Name: " + userDTO.getName());
        System.out.println("UserDTO Email: " + userDTO.getEmail());
    }
}