public class Book implements Packable{
    /*
     *  Book has a constructor which is given the author (String), name of the 
     * book (String), and the weight of the book (double) as parameters
     */

    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.name;
    }
}
