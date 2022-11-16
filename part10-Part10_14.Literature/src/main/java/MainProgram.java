
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookRecommendation> books = new ArrayList<>();

        // Menu
        while (true) {

            System.out.println("Input the name of the book, empty stops:");
            String inputBook = scanner.nextLine();

            if (inputBook.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            books.add(new BookRecommendation(inputBook, ageRecommendation));
        }

        sortByAgeAndName(books);
        printSummary(books);

    }

    public static void printSummary(ArrayList<BookRecommendation> books) {
        
        long items = books.stream().count();
        System.out.println(items + " books in total.");

        System.out.println("Books:");
        books.stream()
            .forEach(book -> System.out.println(book));
    }

    public static void sortByAgeAndName(ArrayList<BookRecommendation> books) {
        Comparator<BookRecommendation> comparator = Comparator
              .comparing(BookRecommendation::getAgeRecommendation)
              .thenComparing(BookRecommendation::getName);
        
        Collections.sort(books, comparator);
    }

}