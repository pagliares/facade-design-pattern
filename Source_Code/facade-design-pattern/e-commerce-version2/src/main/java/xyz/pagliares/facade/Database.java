package xyz.pagliares.facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Martins Pagliares
 */
public class Database {
    private List<Customer> customers;
    private List<Product> products;

    public Database() {
        customers = new ArrayList<Customer>();
        products = new ArrayList<Product>();
        products.add(new Product(18, "Shampoo", 5.60));
        products.add(new Product(25, "ashtray", 2.40));
    }

    public Customer selectCustomer(int id) {
        for (Customer c: customers){
            if (c.getId() == id){
                return c;
            }
        }
        return null;

    }

     public Product selectProduct(int id) {
        for (Product p: products){
            if (p.getId() == id){
                return p;
            }
        }
        return null;

    }

    public void processPayment(Customer c, double amount) {
        System.out.println("Processing the payment of customer \n" + c);
        System.out.println("Sucesfull Payment ! Total $" + amount);
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void addProduct(Product p){
        products.add(p);
    }



}
