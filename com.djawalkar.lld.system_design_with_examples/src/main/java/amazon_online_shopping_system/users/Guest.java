package amazon_online_shopping_system.users;

import amazon_online_shopping_system.cart.ShoppingCart;

public class Guest extends Customer {
    public boolean registerAccount() {
        return false;
    }

    public ShoppingCart getShoppingCart() {
        // functionality
        return null;
    }
}
