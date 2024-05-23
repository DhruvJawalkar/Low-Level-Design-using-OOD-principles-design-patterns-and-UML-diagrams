package amazon_online_shopping_system.users;

import amazon_online_shopping_system.cart.CartItem;
import amazon_online_shopping_system.cart.ShoppingCart;
import amazon_online_shopping_system.enums.OrderStatus;
import amazon_online_shopping_system.enums.PaymentStatus;
import amazon_online_shopping_system.notifications.EmailNotification;
import amazon_online_shopping_system.notifications.Notification;
import amazon_online_shopping_system.orders.Order;
import amazon_online_shopping_system.payments.Payment;
import amazon_online_shopping_system.shipments.Shipment;

import java.util.Date;
import java.util.List;

public class ShoppingSystem {
    private ShoppingSystem(){}
    public static boolean sendShipmentUpdateNotification(Account account, Notification notification){
        return false;
    }
    public static boolean sendOrderNotification(Account account, Notification notification){
        account.notifyUserOnOrderUpdate(notification);
        return true;
    }
    public static boolean processPayment(Payment payment, double amount){
        PaymentStatus status = payment.makePayment(amount);
        if(status==PaymentStatus.CONFIRMED)
            return true;
        return false;
    }
    public static Order createOrder(AuthenticatedUser user, ShoppingCart cart){
        //boolean orderPlacedSuccessfully = false;
        Order customerOrder = new Order("1", new Date(), cart);
        OrderStatus orderStatus = user.placeOrder(customerOrder);
        Notification orderCreatedNotification = new EmailNotification(1, new Date(), customerOrder.getOrderNumber() + "successfully created.");
        boolean orderCreatedNotificationSent = sendOrderNotification(user.getAccount(), orderCreatedNotification);
        //orderPlacedSuccessfully = true;

        return customerOrder;
    }

    public static Shipment createShipment(Order order, AuthenticatedUser user){
        //boolean orderShipmentCreated = false;
        Shipment shipment = new Shipment("1", new Date(), "USPS");
        Notification orderShippedNotification = new EmailNotification(1, new Date(), order.getOrderNumber() + "is now shipped with shipment number" + shipment.getShipmentNumber());
        boolean shipmentNotificationSent = sendOrderNotification(user.getAccount(), orderShippedNotification);
        //orderShipmentCreated = true;

        return shipment;
    }
}
