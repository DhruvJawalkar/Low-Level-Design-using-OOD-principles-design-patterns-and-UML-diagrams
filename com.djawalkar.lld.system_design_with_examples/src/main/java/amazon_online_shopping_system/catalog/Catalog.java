package amazon_online_shopping_system.catalog;

import amazon_online_shopping_system.products.Product;
import amazon_online_shopping_system.products.ProductCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Catalog implements Search {
    private HashMap<String, List<Product>> products;

    public Catalog(){
        products = new HashMap<>();
    }

    public List<Product> searchProductsByName(String name) {
        // functionality
        List<Product> result = new ArrayList<>();

        for(String category : products.keySet()){
            for(Product p : products.get(category)){
                if(p.getName().startsWith(name)){
                    result.add(p);
                }
            }
        }

        return result;
    }

    public List<Product> searchProductsByCategory(String category) {
        // functionality
        return products.get(category);
    }

    public boolean addProductCategory(ProductCategory category){
        products.put(category.getName(), category.getProducts());
        return true;
    }

    public boolean removeProductCategory(ProductCategory category){
        if(!products.containsKey(category.getName()))
            return false;

        products.remove(category.getName());
        return true;
    }
}
