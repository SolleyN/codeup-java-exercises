import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            i++;
//            System.out.println(i);
//        }
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
        // Count by 2's from 0 to 100
//        int number = 0;
//        do {
//            System.out.println(number);
//
//            number += 2;
//
//        } while (number <= 100);

//        for (int i = 0; i <= 100; i += 2)
//        {
//            System.out.println(i);
//        }
//
//        // Count backwards by 5's from 100 to -10
//        number = 100;
//
//        do {
//            System.out.println(number);
//            number -= 5;
//        } while (number >= -10);

//        for (int i = 100; i >= -10; i -= 5  ) {
//            System.out.println(i);
//        }

//        long num = 2;
//        do {
//            System.out.println(num);
//            num *=  2;
//
//        } while (num < 1000000);

//for (int i = 2; i < 1000000; i *= 2){
//    System.out.println(i);


//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int num = 1; num <= 100; num++) {
//            if (num % 3 == 0 && num % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(num);
//                }
//
//        }

//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//
//        Example Output
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        Scanner input = new Scanner(System.in);
//        String result;
//        do {
//            System.out.println("Enter a number");
//            int number = input.nextInt();
//            System.out.println("Number\tSquared\tCubed");
//            System.out.println("======\t======\t======");
//
//            for (int num = 1; num <= number; num++) {
//                System.out.println(num + "\t" + (int) Math.pow(num, 2) + "\t" + (int) Math.pow(num, 3));
//
//            }
//            System.out.println("Do you want to continue? (Y/N): ");
//            result = input.next();
//
//        } while (result.equals("Y"));

//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        String continueOn;
        String gradeLetter;

        do {

            System.out.println("Enter a grade from 0 - 100: ");

            int numberGrade = input.nextInt();

            if (numberGrade >= 99) {
                gradeLetter = "A+";
            } else if (numberGrade >= 90) {
                gradeLetter = "A";
            } else if (numberGrade >= 89) {
                gradeLetter = "B+";
            } else if (numberGrade >= 80) {
                gradeLetter = "B";
            } else if (numberGrade >= 79) {
                gradeLetter = "C+";
            } else if (numberGrade >= 70) {
                gradeLetter = "C";
            } else if (numberGrade >= 69) {
                gradeLetter = "D+";
            } else if (numberGrade >= 60) {
                gradeLetter = "D";
            } else {
                gradeLetter = "F";
            }

            System.out.println("The letter grade is: " + gradeLetter);

            System.out.println("Would you like to enter another grade? (yes/no): ");

            continueOn = input.next();

        } while (continueOn.equalsIgnoreCase("yes"));

        System.out.println("Have a wonderful rest of your day!");


    }

}


