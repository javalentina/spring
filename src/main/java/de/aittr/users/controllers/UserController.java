package de.aittr.users.controllers;

import de.aittr.users.dao.OrdersDAO;
import de.aittr.users.dao.UsersDAO;
import de.aittr.users.entity.Order;
import de.aittr.users.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController{

    private UsersDAO usersDAO = new UsersDAO();
    private List<User> users = usersDAO.getUsers();
    private OrdersDAO orderDAO = new OrdersDAO();
    private List<Order> orders = OrdersDAO.getOrders();
    @GetMapping(value = "/users")
    public String usersList(@RequestParam(name="city",required = false, defaultValue = "all") String city, Model model) {
       List <User> res= users;
       if(!city.equals("all")){
           res = users.stream().filter(c->c.getCity().equals(city)).toList();
       }
        model.addAttribute("users", res);
        return "users";
    }

    /*Class work*/
   /* @GetMapping(value="/users/{id}")
    public String UserById(@PathVariable int id, Model model){
        List<User> res=new ArrayList<>();
        res.add(users.get(id));
        model.addAttribute("users", res);
        model.addAttribute("user_id", id);
        return "user-info";
    }*/

    /*User ID*/
    @GetMapping(value="/users/{id}")
    public String UserById(@PathVariable int id, Model model){

        User user = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
        model.addAttribute("user", user);
        return "user-info";
    }



}
