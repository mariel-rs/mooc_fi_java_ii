public class Organism implements Movable {
    
    private int posX;
    private int posY;

    public Organism(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    @Override
    public String toString() {
        return "x: " + this.posX + "; y: " + this.posY;
    }

    public void move(int dx, int dy) {
        // Move the organism
        this.posX += dx;
        this.posY += dy;   
    }
}
