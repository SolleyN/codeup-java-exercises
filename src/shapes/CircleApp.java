package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle Daddy!: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("Area: %.02f ", area);
        System.out.printf("%nCircumference: %.02f ", circumference);

        input.close();
    }
}
