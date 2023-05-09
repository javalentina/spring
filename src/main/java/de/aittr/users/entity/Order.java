package de.aittr.users.entity;

import java.util.Objects;

public class Order {
    private int orderID;
    private User user;

    public Order(int orderID, User user, String title) {
        this.orderID = orderID;
        this.user = user;
        this.title = title;
    }

    private String title;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderID != order.orderID) return false;
        if (!Objects.equals(user, order.user)) return false;
        return Objects.equals(title, order.title);
    }

    @Override
    public int hashCode() {
        int result = orderID;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", user=" + user.getName() +
                ", title='" + title + '\'' +
                '}';
    }
}
