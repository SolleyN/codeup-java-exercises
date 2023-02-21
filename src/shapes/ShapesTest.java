package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(6.0);

        Measurable myShape1 = new Rectangle(5, 5);
        System.out.println(myShape.getArea());

    }


}


