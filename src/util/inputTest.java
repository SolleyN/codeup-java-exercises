package util;

public class inputTest {


    public static void main(String[] args) {
        Input input = new Input();

        // Testing getString();

        System.out.println("Enter a string Daddy");
        String str = input.getString();
        System.out.printf("You entered %s%n ", str);

        // Testing Boolean yesNo();

        System.out.println("Enter yes or no Daddy~!");
        boolean yn = input.Yesno();
        System.out.printf("You entered %b%n", yn);

        //Testing getInt();

        System.out.println("Enter an integer between 69 and 420 Daddy!");
        int number = input.getInt(69, 420);
        System.out.printf("You entered : " + number);

        //test getDouble();
        System.out.println("Enter a Decimal Daddy!");
        double dnumber = input.getDouble(0.0, 1.0);
        System.out.printf("You entered : " + dnumber);
    }

}
