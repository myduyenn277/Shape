package Shape.repository;

import Shape.dataAccess.ShapeDao;
import Shape.model.Circle;
import Shape.model.Retangle;
import Shape.model.Triangle;

public class ShapeRepository implements IShapeRepository{
    
    @Override
    public Triangle inputTriangle() {
        return ShapeDao.Instance().inputTriangle();
    }

    @Override
    public Retangle inputRectangle() {
       return ShapeDao.Instance().inputRetangle();
    }

    @Override
    public Circle inputCircle() {
        return ShapeDao.Instance().inputCircle();
    }

    @Override
    public void display(Triangle trigle, Retangle rectangle, Circle circle) {
        ShapeDao.Instance().display(trigle, rectangle, circle);
    }
}