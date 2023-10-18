package Shape.dataAccess;

import Shape.common.Validation;
import Shape.model.Circle;
import Shape.model.Retangle;
import Shape.model.Triangle;

public class ShapeDao {
     static ShapeDao instance = null;

    public static ShapeDao Instance() {
        if (instance == null) {
            synchronized (ShapeDao.class) {
                if (instance == null) {
                    instance = new ShapeDao();
                }
            }
        }
        return instance;
    }
    Validation va  = new Validation();

    public Triangle inputTriangle() {
        while (true) {
            double a = va.getInputDouble("Please input side A of Triangle");
            double b = va.getInputDouble("Please input side B of Triangle");
            double c = va.getInputDouble("Please input side C of Triangle");
            if (va.checkTriangle(a, b, c)) {
                Triangle t = new Triangle(a, b, c);
                return t;
            }
            System.out.println("Can not create a triangle");
            System.out.println("Please, input again");
        }

    }

    public Retangle inputRetangle() {
        double width = va.getInputDouble("Please input side width of Rectangle");
        double length = va.getInputDouble("Please input length of Rectangle");
        return new Retangle(width, length);
    }

    public Circle inputCircle() {
        double radius = va.getInputDouble("Please input radius of Circle");
        return new Circle(radius);
    }

    public void inputShape() {
        inputRetangle();
        inputCircle();
        inputTriangle();
    }
    
    public void display(Triangle trigle, Retangle rectangle, Circle circle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    } 
}
