package Day4;

import Day4.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Inventory {
    private HashMap<String, List<Product>> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void put(Product product) {
        List<Product> productList = products.getOrDefault(product.getName(), new ArrayList<>());
//        System.out.println(productList);
        productList.add(product);

        products.put(product.getName(), productList);
    }
    public void getAllProducts() {
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
    public List<Product> get(String name) {
//        System.out.println(products.getOrDefault(name, new ArrayList<>()));
        return products.getOrDefault(name, new ArrayList<>());
    }

    public boolean remove(String name) {
//        if (products.containsKey(name)) {
//            products.remove(name);
//            return true;
//        }
//        return false;

        List<Product> productList = products.get(name);
        if (productList != null && productList.size() > 1) {
            products.remove(name);
            return true;
        }
        return false;
    }

    public double totalPriceOf(String name) {
        List<Product> productList = products.get(name);
        double totalPrice = 0.0;
        if (productList != null) {
            for (Product product : productList) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public int countTotal(String name) {
        List<Product> productList = products.get(name);
        return productList != null ? productList.size() : 0;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + products +
                '}';
    }
}


