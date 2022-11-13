
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            return Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .map(info -> new Book(info[0], Integer.valueOf(info[1]), Integer.valueOf(info[2]), info[3]))
                .collect(Collectors.toList());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();
    }
}