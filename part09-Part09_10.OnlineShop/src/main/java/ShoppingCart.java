import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemsInCart;

    public ShoppingCart() {
        this.itemsInCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.itemsInCart.containsKey(product)) {
            this.itemsInCart.get(product).increaseQuantity();
        }
        else {
            this.itemsInCart.put(product, new Item(product, 1, price));
        }
        
    }

    public int price() {
        int cartPrice = 0;
        for (Item item : itemsInCart.values()) {
            cartPrice += item.price();
        }

        return cartPrice;
    }

    public void print() {
        for (Item item : itemsInCart.values()) {
            System.out.println(item);
        }
    }

}
