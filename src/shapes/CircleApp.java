package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle Daddy! : ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        input.close();
    }
}
