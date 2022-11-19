import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private ArrayList<Person> listOfEmployees;

    public Employees() {
        this.listOfEmployees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.listOfEmployees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.listOfEmployees.addAll(peopleToAdd);
    }

    public void print() {

        Iterator<Person> iterator = listOfEmployees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {

        Iterator<Person> iterator = listOfEmployees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
    
        Iterator<Person> iterator = listOfEmployees.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }

}
