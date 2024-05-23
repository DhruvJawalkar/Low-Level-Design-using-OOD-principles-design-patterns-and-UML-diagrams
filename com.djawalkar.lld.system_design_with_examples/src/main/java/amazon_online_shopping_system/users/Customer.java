package amazon_online_shopping_system.users;

import amazon_online_shopping_system.cart.ShoppingCart;
import amazon_online_shopping_system.enums.OrderStatus;

// Customer is an abstract class
public abstract class Customer {
    protected ShoppingCart cart;
    public abstract ShoppingCart getShoppingCart();
}


