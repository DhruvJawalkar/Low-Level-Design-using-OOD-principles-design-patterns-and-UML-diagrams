package amazon_online_shopping_system.products;

import java.util.List;

public class ProductCategory {
    private String name;
    private String description;
    private List<Product> products;

    public ProductCategory(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        product.setCategory(this);
    }
}
