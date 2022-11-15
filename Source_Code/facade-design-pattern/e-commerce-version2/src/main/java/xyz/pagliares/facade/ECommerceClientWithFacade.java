package xyz.pagliares.facade;

/**
 *
 * @author Rodrigo Martins Pagliares
 */
public class ECommerceClientWithFacade {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.register("Rodrigo", 123);
        facade.shopping(18, 123);
        facade.shopping(25, 123);
        facade.finishShopping(123);
    }
}
