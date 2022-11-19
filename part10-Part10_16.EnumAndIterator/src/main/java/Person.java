public class Person {
    private String name;
    private Education education;

    public Person(String name, Education ed) {
        this.name = name;
        this.education = ed;
    }

    public String getName() {
        return this.name;
    }

    public Education getEducation() {
        return this.education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education;
    }

}
