import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> aHeard;

    public Herd() {
        this.aHeard = new ArrayList<>();
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable one : aHeard) {
            output += one.toString() + "\n";
        }
        return output;
    }

    public void addToHerd(Movable movable) {
        this.aHeard.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable movable: this.aHeard){
            movable.move(dx, dy);
        }
    }

}
