package amazon_online_shopping_system.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private double totalPrice;
    private List<CartItem> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    public boolean addItem(CartItem item) {
        this.items.add(item);
        this.totalPrice += item.getQuantity() * item.getPrice();
        return true;
    }

    public boolean removeItem(CartItem item) {
        if(items.contains(item)){
            items.remove(item);
            this.totalPrice -= item.getQuantity() * item.getPrice();
            return true;
        }
        else return false;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public boolean checkout() {
        //verify items in cart are available
        //
        return true;
    }

    public double getTotalPrice(){
        return totalPrice;
    }
}
