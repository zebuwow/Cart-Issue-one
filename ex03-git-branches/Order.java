// An order is the combination of a cart and tax
// different states apply different salesTax rates.
public class Order {

    private Cart cart;
    private Customer customer;

    private int id = 0;

    public Order( Cart c, Customer user, String p ) {
        cart = c;
        customer = user;
        id++;
      }

    // Receipt Method is not finished 
    public void receipt() {
      // TODO: Print order number, customer information, cart, and total.
    }
}