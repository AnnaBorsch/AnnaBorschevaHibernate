package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Анна", "Борщева", (byte) 32);
        userService.saveUser("Алексей", "Скворцов", (byte) 36);
        userService.saveUser("Олег", "Хамин", (byte) 44);
        userService.saveUser("Мария", "Сергеева", (byte) 33);


        List<User> users = userService.getAllUsers();
        System.out.println("Все пользователи:");
        for (User user : users) {
            System.out.println(user);
        }

        userService.removeUserById(1);


        List<User> usersAfterRemoval = userService.getAllUsers();
        System.out.println("Пользователи после удаления:");
        for (User user : usersAfterRemoval) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}


