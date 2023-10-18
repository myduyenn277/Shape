package Shape.repository;

import Shape.model.Circle;
import Shape.model.Retangle;
import Shape.model.Triangle;

public interface IShapeRepository {
    Triangle inputTriangle();
    Retangle inputRectangle();
    Circle inputCircle();
    void display(Triangle trigle, Retangle retangle, Circle circle);
}
