package Shape.model;

public class Retangle extends Shape {

    private double width;
    private double length;

    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----"
                + "\nWidth: " + width
                + "\nLength: " + length
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter());
    }
}
