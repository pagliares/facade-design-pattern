package xyz.pagliares.facade;

/**
 *
 * @author Rodrigo Martins Pagliares
 */
public class ECommerceClientWithoutFacade {
    public static void main(String[] args) {
        /* getting a reference to the database */
        Database database = new Database();

        /* Creating a customer called Rodrigo, adding him to the database
         * associating him with a shopping cart
         */
        Customer rodrigo = new Customer(123, "Rodrigo");
        database.addCustomer(rodrigo);
        ShoppingCart cart = new ShoppingCart();
        rodrigo.setShoppingCart(cart);

        /* Rodrigo buying the products with codes 18 and 25 stored in the database */
        Product p = database.selectProduct(18);
        Product p1 = database.selectProduct(25);
        rodrigo.getShoppingCart().addProduct(p);
        rodrigo.getShoppingCart().addProduct(p1);

        /* finish the payment process */
        double amount = rodrigo.getShoppingCart().getAmount();
        database.processPayment(rodrigo, amount);
    }

}
