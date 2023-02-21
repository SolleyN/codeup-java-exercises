package shapes;

public class Rectangle extends Quadrilateral {
//    protected int length;
//    protected int width;

    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
        super(length, width);
    }

    //    public int getArea() {
//        return length * width;
//    }
//    public int getPerimeter() {
//        return 2 * ( length + width);
//    }
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}

