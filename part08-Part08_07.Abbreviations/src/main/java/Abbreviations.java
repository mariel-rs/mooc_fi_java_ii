import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbMap;

    public Abbreviations() {
        this.abbMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbMap.get(abbreviation);
    }
}