import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    
    private int maxWeight;
    private ArrayList<Item> itemsInBox;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.itemsInBox = new ArrayList<>();
    }

    private int getBoxWeight() {
        int boxWeight = 0;
        for (Item item : itemsInBox) {
            boxWeight += item.getWeight();
        }
        return boxWeight;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + this.getBoxWeight() <= this.maxWeight) {
            this.itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.itemsInBox.contains(item)) {
            return true;
        }
        return false;
    }
}