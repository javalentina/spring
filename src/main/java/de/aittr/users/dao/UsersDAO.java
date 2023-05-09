package de.aittr.users.dao;

import de.aittr.users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UsersDAO {
    public static List<User> getUsers() {
        List<User> userList = new ArrayList<>(
                List.of(
                        new User(11, "Jack", "Berlin"),
                        new User(22, "Nick", "Paris"),
                        new User(33, "Lena", "Berlin"),
                        new User(44, "Ted", "Oslo")
                )
        );
        return userList;
    }
}
