public class BookRecommendation implements Comparable<BookRecommendation> {
    
    private String name;
    private int ageRecommendation;

    public BookRecommendation(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
    
    @Override
    public int compareTo(BookRecommendation book) {
        return this.ageRecommendation - book.getAgeRecommendation();
    }
}