package de.aittr.users.dao;

import de.aittr.users.entity.Order;
import de.aittr.users.entity.User;

import java.util.ArrayList;
import java.util.List;

public class OrdersDAO {
    public static List<Order> getOrders(){
        List<User> userList = UsersDAO.getUsers();

        List<Order> orderList = new ArrayList<>(
                List.of(
                        new Order(100,userList.get(0),"Title one"),
                        new Order(200,userList.get(1),"Title two"),
                        new Order(300,userList.get(2),"Title three"),
                        new Order(400,userList.get(3),"title four")
                )
        );
        return orderList;
    }
}
