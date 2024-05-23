package amazon_online_shopping_system;

import amazon_online_shopping_system.cart.CartItem;
import amazon_online_shopping_system.cart.ShoppingCart;
import amazon_online_shopping_system.catalog.Catalog;
import amazon_online_shopping_system.orders.Order;
import amazon_online_shopping_system.payments.CreditCard;
import amazon_online_shopping_system.products.Product;
import amazon_online_shopping_system.products.ProductCategory;
import amazon_online_shopping_system.shipments.Shipment;
import amazon_online_shopping_system.users.Account;
import amazon_online_shopping_system.users.Admin;
import amazon_online_shopping_system.users.AuthenticatedUser;
import amazon_online_shopping_system.users.ShoppingSystem;

public class Main {
    public static void main(String[] args) {
        Account adminAccount = new Account("Admin", "admin@amazon.com", "111-111-1111", "admin", "password");
        Admin admin = new Admin(adminAccount);

        ProductCategory electronicsCategory = new ProductCategory("Electronics", "Category for electronic items and gadgets");
        Product headphones = new Product("1", "Sony headphones", 99.99);
        headphones.updateAvailableCount(1);
        electronicsCategory.addProduct(headphones);
        Catalog catalog = new Catalog();
        catalog.addProductCategory(electronicsCategory);

        Account userAccount = new Account("User", "user@amazon.com", "211-111-1111", "user", "11111");
        Address userAddress = new Address("11 St unit 1111", "San Jose", "CA", "USA");
        CreditCard userCreditCard = new CreditCard("1111111111111111", "11/30", userAccount.getName(), 111, userAddress);
        userAccount.addShippingAddress(userAddress);
        userAccount.addCreditCard(userCreditCard);

        ShoppingCart cart = new ShoppingCart();
        AuthenticatedUser user = new AuthenticatedUser(userAccount, cart);
        CartItem item = new CartItem(headphones, 1);
        cart.addItem(item);

        //checkout items, verify if all items in cart are still available
        boolean isAvailableToCheckout = cart.checkout();
        if(isAvailableToCheckout){
            boolean isPaymentSuccessful = ShoppingSystem.processPayment(userCreditCard, cart.getTotalPrice());
            if(isPaymentSuccessful){
                //create order
                //create order created successfully notification
                //notify user account with notification
                Order customerOrder = ShoppingSystem.createOrder(user, cart);
                //add order to queue and process shipment

                //create shipment for order with shipment method
                //create order shipment notification with shipment number
                //notify user account with order shipment notification
                Shipment shipment = ShoppingSystem.createShipment(customerOrder, user);

                //order shipped successfully
                //notify user with successful shipment and eta
                System.out.println("Order with" + customerOrder.getOrderNumber() + "shipped successfully with shipment method " + shipment.getShipmentMethod()
                        + "and shipment number " + shipment.getShipmentNumber() + ". Estimated time for shipment delivery is" + shipment.getEstimatedArrival());
            }
        }
        else{
            System.out.println("Unable to checkout items in cart, some products are no longer available");
        }


    }
}
