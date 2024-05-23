# Amazon Online Shopping System

## Requirements:

- R1: A customer can either be an authenticated user or a guest. The authenticated user is one with a registered account on the Amazon online shopping system, whereas a guest does not have a registered account.
- R2: An authenticated user should be able to buy, sell, and search the products via the product name or category. A guest is only able to search for products.
- R3: A product can have multiple reviews and ratings from multiple customers.
- R4: An authenticated user should be able to add, remove, or modify product items in their shopping cart. The authenticated user can further check out and buy the items.
- R5: The authenticated user should be able to specify a shipping address at the time of order.
- R6: Payment can be made through credit cards, electronic bank transfers, or through cash on delivery.
- R7: An order can be canceled, only in the case that it hasn’t been shipped.
- R8: Notifications are sent whenever there is a change in the order or shipping status.
- R9: Shipment can be tracked to see the current status and the estimated time of arrival for the order.
- R10: An admin should exist that can add, modify, or remove product categories and block users.

## Use Case Diagram:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/use-case-diagram.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/use-case-diagram.png)

## Class Diagram:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/class-diagram.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/class-diagram.png)

## Sequence Diagrams:

### Checkout And Pay
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-checkout-and-pay.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-checkout-and-pay.png)

### Search And Add Item
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-search-and-add-item.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/b8dffe1777219ef80b3033fd3f0adc984e61357a/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/sequence-diagram-search-and-add-item.png)

## Activity Diagrams:

### Customer Buying a Product:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/e5028cc7d66c7ec0b956c81f1d83d97ee4fae2c7/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/activity-diagram-customer-buying-a-product.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/e5028cc7d66c7ec0b956c81f1d83d97ee4fae2c7/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/activity-diagram-customer-buying-a-product.png)

### Customer Receives Their Product:
![https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/e5028cc7d66c7ec0b956c81f1d83d97ee4fae2c7/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/activity-diagram-customer-receives-their-product.png](https://github.com/DhruvJawalkar/Low-Level-Design-using-OOD-principles-design-patterns-and-UML-diagrams/blob/e5028cc7d66c7ec0b956c81f1d83d97ee4fae2c7/com.djawalkar.lld.system_design_with_examples/src/main/java/amazon_online_shopping_system/uml-diagrams/activity-diagram-customer-receives-their-product.png)

## Code:
```java
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
```