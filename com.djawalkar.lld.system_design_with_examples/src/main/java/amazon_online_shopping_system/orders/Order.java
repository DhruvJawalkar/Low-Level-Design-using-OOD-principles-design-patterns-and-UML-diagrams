package amazon_online_shopping_system.orders;

import amazon_online_shopping_system.cart.ShoppingCart;
import amazon_online_shopping_system.enums.OrderStatus;
import amazon_online_shopping_system.payments.Payment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLogs;
    private ShoppingCart shoppingCart;

    public Order(String orderNumber, Date orderDate, ShoppingCart shoppingCart){
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.shoppingCart = shoppingCart;
        this.status = OrderStatus.UNSHIPPED;

        this.orderLogs = new ArrayList<>();
    }

    public boolean makePayment(Payment payment) {
        return false;
    }

    public boolean addOrderLog(OrderLog orderLog) {
        this.orderLogs.add(orderLog);
        return true;
    }
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<OrderLog> getOrderLogs() {
        return orderLogs;
    }
}


