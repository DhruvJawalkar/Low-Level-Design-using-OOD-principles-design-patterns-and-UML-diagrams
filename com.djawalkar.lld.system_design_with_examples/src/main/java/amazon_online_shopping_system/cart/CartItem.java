package amazon_online_shopping_system.cart;

import amazon_online_shopping_system.products.Product;

public class CartItem {
    private int quantity;
    private double price;
    private Product product;

    public CartItem(Product product, int quantity){
        this.product = product;
        this.price = product.getPrice();
        this.quantity = quantity;
    }

    public boolean updateQuantity(int quantity) {
        if(quantity < 0){
            throw new IllegalArgumentException("Invalid quantity specified");
        }

        this.quantity = quantity;
        return true;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

}