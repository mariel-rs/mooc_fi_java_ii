public class Literacy implements Comparable<Literacy> {
    
    private String country;
    private String gender;
    private int year;
    private Double rate;

    public Literacy(String country, String gender, int year, Double rate) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.rate = rate;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGender() {
        return this.gender;
    }

    public int getYear() {
        return this.year;
    }

    public Double getRate() {
        return this.rate;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }

    @Override
    public int compareTo(Literacy literacy) {
        return this.rate.compareTo(literacy.getRate());
    }

}