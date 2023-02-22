package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<String, Student>();

        students.put("Janice Suever", new Student("Janice Suever"));
        students.put("Nickolas Solley", new Student("Nickolas Solley"));
        students.put("Kaleb Davis", new Student("Kaleb Davis"));

        students.get("Janice Suever").addGrade(96);
        students.get("Janice Suever").addGrade(69);
        students.get("Janice Suever").addGrade(44);

        students.get("Nickolas Solley").addGrade(91);
        students.get("Nickolas Solley").addGrade(94);
        students.get("Nickolas Solley").addGrade(93);

        students.get("Kaleb Davis").addGrade(54);
        students.get("Kaleb Davis").addGrade(65);
        students.get("Kaleb Davis").addGrade(44);

        Scanner input = new Scanner(System.in);

        String userInput;

        do {

            System.out.println("Hello There!\n");

            System.out.println("Here are some Github usernames  of the students: ");

            for (String username : students.keySet()) {

                System.out.print(" | " + username + " |");

            }
            System.out.println("\n\n What student would you like information on?");
            userInput = input.nextLine();

            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("\n Name: " + student.getName());
                System.out.println("\n Grade: " + student.getGradeAverage());
            } else {
                System.out.println("404 ERROR, no student was found with that Github Username. " + userInput);
            }

            System.out.println("\n Wanna see another student or what? (Yes/No)");
            userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("no")) {
                System.out.println("Cya Later!");
            }


        } while (userInput.equalsIgnoreCase("Yes"));
    }
}
