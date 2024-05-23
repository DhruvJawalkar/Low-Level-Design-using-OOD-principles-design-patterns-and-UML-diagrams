package amazon_online_shopping_system.users;

import amazon_online_shopping_system.cart.ShoppingCart;
import amazon_online_shopping_system.enums.OrderStatus;
import amazon_online_shopping_system.orders.Order;

import java.util.List;

public class AuthenticatedUser extends Customer {
    private Account account;
    private List<Order> orders;

    public AuthenticatedUser(Account account, ShoppingCart cart){
        this.account = account;
        this.cart = cart;
    }
    public OrderStatus placeOrder(Order order) {
        orders.add(order);
        return order.getStatus();
    }

    @Override
    public ShoppingCart getShoppingCart() {
        return cart;
    }

    public Account getAccount() {
        return account;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
