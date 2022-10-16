import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsInWarehouse;
    private Map<String, Integer> productsPrice;

    public Warehouse() {
        this.productsInWarehouse = new HashMap<>();
        this.productsPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsInWarehouse.put(product, stock);
    }

    public int price(String product) {
        return this.productsPrice.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productsInWarehouse.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.productsInWarehouse.containsKey(product) && this.productsInWarehouse.get(product) > 0) {
            int inStock = this.productsInWarehouse.get(product) -1;
            this.productsInWarehouse.replace(product, inStock);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return this.productsInWarehouse.keySet();
    }
}