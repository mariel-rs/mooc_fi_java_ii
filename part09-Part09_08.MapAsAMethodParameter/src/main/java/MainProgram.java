import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }

    public static int returnSize(Map aMap) {
        return aMap.size();
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
}
