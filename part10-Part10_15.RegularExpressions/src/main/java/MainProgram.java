

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        String day = "mon";
        String example = "aaaab";
        String time = "04:59:31";

        Checker checker = new Checker();
        System.out.println(checker.isDayOfWeek(day));
        System.out.println(checker.allVowels(example));
        System.out.println(checker.timeOfDay(time));
    }
}
