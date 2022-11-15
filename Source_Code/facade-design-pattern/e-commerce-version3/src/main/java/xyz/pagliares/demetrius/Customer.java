package xyz.pagliares.demetrius;

/**
 *
 * @author pagliares
 */
public class Customer {
    private int id;
    private String name;
    private ShoppingCart cart;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    public void setShoppingCart(ShoppingCart cart) {
        this.cart = cart;
    }
    
    public ShoppingCart getShoppingCart() {
        return cart;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer id.....:" + id + "\n" +
                "Customer Name...:" + name;
    }

    double calcularTotal() {
        return cart.getAmount();
    }


    
    





}
