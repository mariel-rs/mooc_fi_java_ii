import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> cards;


    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
                    .forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(cards);
    }

    private int sumOfValues() {
        return this.cards.stream()
                        .map(card -> card.getValue())
                        .reduce(0, (c1, c2) -> c1 + c2);
    }

    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }

    public void sortBySuit() {
        BySuitInValueOrder sortBySuit = new BySuitInValueOrder();
        Collections.sort(this.cards, sortBySuit);
    }
    
}
