package xyz.pagliares.facade;

/**
 *
 * @author Rodrigo Martins Pagliares
 */
public class Facade {
    private Database database;
    private Customer customer;
    private ShoppingCart cart;
    private Product product;

    public Facade() {
        database = new Database();
    }

    public void register(String nome, int id){
        customer = new Customer(id, nome);
        cart = new ShoppingCart();
        customer.setShoppingCart(cart);
        database.addCustomer(customer);
    }

    public void shopping(int produID, int clientID) {
        customer = database.selectCustomer(clientID);
        product = database.selectProduct(produID);
        customer.getShoppingCart().addProduct(product);
    }

    public void finishShopping(int clientID) {
         customer = database.selectCustomer(clientID);
         double amount = customer.getShoppingCart().getAmount();
         database.processPayment(customer, amount);
    }





}
