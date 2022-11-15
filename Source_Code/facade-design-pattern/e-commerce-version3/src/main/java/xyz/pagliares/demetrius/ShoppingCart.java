package xyz.pagliares.demetrius;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pagliares
 */
public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        this.products.add(p);

    }

    public double getAmount() {
        double amount = 0.0;
        for (Product p: products){
            amount+= p.getPrice();
        }
        return amount;
    }

    @Override
    public String toString() {
        String result = "";
        for (Product p: products) {
            result+= p.toString();
        }
        return result;
    }


}
