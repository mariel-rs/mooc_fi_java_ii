import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> itemsInBox;

    public Box(double capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }

    @Override
    public double weight() {

        double weight = 0.0;

        for (Packable item : itemsInBox) {
            weight += item.weight();
        }

        return weight;
    }

    public void add(Packable item) {

        // Add item to box only if it can hold the weight and update box weight
        if (item.weight() + this.weight() <= this.capacity) {
            itemsInBox.add(item);
        }
   
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}