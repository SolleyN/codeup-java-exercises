/* TODO: create an array of doubles called numbers and assign five different values (try with and without an initializer).
    Find the sum of all five double values using an enhanced for loop.
 */
public class arrayExercise {

    public static void main(String[] args) {
//        double numbers[] = {1.0, 1.3, 1.5, 1.7, 1.8};
//
//        double sum = 0.0;
//        for (double number : numbers) {
//            sum += number;
//        }
//        System.out.println("Your sum is: " + sum);

        double[] numbers = new double[5];
       numbers[0] = 1.5;
       numbers[1] = 1.7;
       numbers[2] = 1.3;
       numbers[3] = 1.2;
       numbers[4] = 1.6;
       double sum =0.0;
       for (double number : numbers) {
           sum += number;
       }
        System.out.println("Your sum is :" + sum);
    }

}

