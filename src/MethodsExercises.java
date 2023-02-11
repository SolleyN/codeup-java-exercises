public class MethodsExercises {

    // All arithmetic methods go into the main method
    // Methods are called inside the main method to perform functions
    public static void main(String[] args) {

        int result1 = addNum(7, 7);
        System.out.println(result1);

        int result2 = multiplyNum(69, 69);

        System.out.println(result2);

        int result3 = divideNum(420, 69);
        System.out.println(result3);

        int result4 = subtractNum(240, 96);
        System.out.println(result4);
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

}










