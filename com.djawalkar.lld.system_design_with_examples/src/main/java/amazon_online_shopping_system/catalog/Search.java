package amazon_online_shopping_system.catalog;

import amazon_online_shopping_system.products.Product;

import java.util.List;

public interface Search {
    public List<Product> searchProductsByName(String name);
    public List<Product> searchProductsByCategory(String category);
}

