package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(6.0);

        System.out.println("The perimeter of the Square is: " + myShape.getPerimeter());
        System.out.println("The Area of the Square is: " + myShape.getArea());

        Measurable myShape1 = new Rectangle(5, 5);

        System.out.println("The Area of the Rectangle is: " + myShape1.getArea());
        System.out.println("The Perimeter of the Rectangle is: " + myShape1.getPerimeter());

    }


}


