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

//        int num = 2;
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
//
//
//
//            }
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
        String result;
        do {
            System.out.println("Enter a number");
            int number = input.nextInt();
            System.out.println("Number\tSquared\tCubed");
            System.out.println("======\t======\t======");

            for (int num = 1; num <= number; num++) {
                System.out.println(num + "\t" + (int) Math.pow(num, 2) + "\t" + (int) Math.pow(num, 3));

            }
            System.out.println("Do you want to continue? (Y/N): ");
            result = input.next();

        } while (result.equals("Y"));
    }
}


