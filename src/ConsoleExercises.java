import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        double pi = 3.14159;
// System.out.printf("The value of pi is approximately: %s",(int)(pi * 100) /100.0);
// System.out.printf("The value of pis is approximately: %.2f. ", pi);
        //String message =String.valueO(fSystem.out.format("The value of pi is approximately: %.2f.", pi);
// System.out.println(message);

//        System.out.println("Enter an integer");
//     int number = input.nextInt();
//        System.out.println("You entered:"  + number);

//
//        System.out.println("Enter 3 words:");
//
//        String word1 = input.next();
//
//        System.out.println("Word 1 is :" + word1);
//
//        String word2 = input.next();
//
//        System.out.println("Word 2 is :" + word2);
//
//        String word3 = input.next();
//
//        System.out.println("Word 3 is :" + word3);

//// or you can type System.out.print(word1 + "\n" +word2 + "\n" +word3);
      //  or
           //     System.out.printf(""%s\n%s\n%s", word1, word2, word3);
//        System.out.println("Enter a sentence");
//
////        String sentence = input.next();
////        System.out.println(sentence);
//
//        String sentence = input.nextLine();
//        System.out.println(sentence);




        System.out.println("Enter the length of the classroom");
        double length = Double.parseDouble(input.nextLine());
        System.out.println("Enter the width of the classroom");
        double width = Double.parseDouble(input.nextLine());
        double area = width * length;
        double perimeter = (width * 2 + length * 2);
        System.out.printf("The area of the classroom is: %d\n", area);
        System.out.printf("The perimeter of the classroom is: %d\n", perimeter);

//input.useDelimiter("");


    }
}
