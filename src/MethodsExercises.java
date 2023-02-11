public class MethodsExercises {

    // All arithmetic methods go into the main method
    // Methods are called inside the main method to perform functions
    public static void main(String[] args) {

        int result1 = addNum(7, 7);
        System.out.println("Adding numbers: " + result1);

        int result69 = multiplyNum(25, 2);

        System.out.println("Multiplying Numbers: " + result69);

        int result2 = 1;
        int i;

        for (i = 1; i <= 3; i++) {
            result2 = multiplyNum(result2, i);
        }

        System.out.println("Multiplying using a for loop: " + result2);

        int x = 5;
        int y = 10;
        int recursion = multiplyRecursion(x, y);

        System.out.println("Multiplied numbers using recursion:" + recursion);

        int result3 = divideNum(420, 69);
        System.out.println("Dividing Numbers: " + result3);

        int result4 = subtractNum(420, 69);
        System.out.println("Subtracting Numbers: " + result4);

        int result5 = modulus(420, 69);
        System.out.println("The modulus is: " + result5);


    }

    // methods need to be placed outside the PSVM method to function properly.
    public static int addNum(int x, int y) {
        return x + y;
    }

    public static int multiplyNum(int a, int b) {
        return a * b;
    }

    public static int divideNum(int a, int b) {
        return a / b;
    }

    public static int subtractNum(int x, int y) {
        return x - y;
    }

    public static int modulus(int x, int y) {

        return x % y;

    }


    // Using recursion to multiply numbers


    public static int multiplyRecursion(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x + multiplyRecursion(x, y - 1);
    }
}