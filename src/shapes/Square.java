package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
    @Override
    public void setLength(double length) {
        this.length = width;
        this.width = length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }
}

