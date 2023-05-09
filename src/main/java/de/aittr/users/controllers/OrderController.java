package de.aittr.users.controllers;

import de.aittr.users.dao.OrdersDAO;
import de.aittr.users.dao.UsersDAO;
import de.aittr.users.entity.Order;
import de.aittr.users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Controller
public class OrderController {
    private UsersDAO usersDAO = new UsersDAO();
    private List<User> users = usersDAO.getUsers();
    private OrdersDAO orderDAO = new OrdersDAO();
    private List<Order> orders = OrdersDAO.getOrders();

    @GetMapping(value = "/orders")
    public String orderList(Model model) {
        List<Order> orderList= orders;
        //System.out.println("Number of orders: " + orders.size());
        model.addAttribute("orders", orderList);
        return "orders";
    }
}
