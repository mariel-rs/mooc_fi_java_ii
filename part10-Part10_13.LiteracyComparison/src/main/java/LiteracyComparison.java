import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        List<Literacy> literacy = processLiteracy();
        Collections.sort(literacy);
        literacy.stream().forEach(lit -> System.out.println(lit));
    }

    public static List<Literacy> processLiteracy() {
        
        try {
            return Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.split(","))
                .map(info -> 
                    new Literacy(info[3].trim(), 
                    info[2].substring(1, info[2].lastIndexOf(" (%)")), 
                    Integer.valueOf(info[4]), 
                    Double.valueOf(info[5])))
                .collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();
    }
}