package xyz.pagliares.demetrius;

/**
 *
 * @author pagliares
 */
public class Facade {

    private Database database;
    private Customer customer;
    private Product product;

    public Facade() {
        database = new Database();
    }

    public void register(String nome, int id) {
        customer = new Customer(id, nome);
        database.addCustomer(customer);
    }

    public void shopping(int produID, int clientID) {
        customer = database.selectCustomer(clientID);
        product = database.selectProduct(produID);
        customer.getShoppingCart().addProduct(product);
    }

    public void finishShopping(int clientID) {
        customer = database.selectCustomer(clientID);
        double amount = customer.calcularTotal();
        database.processPayment(customer, amount);
    }
}
