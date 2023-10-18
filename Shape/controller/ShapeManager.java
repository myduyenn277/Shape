package Shape.controller;

import Shape.model.Circle;
import Shape.model.Retangle;
import Shape.model.Triangle;
import Shape.repository.IShapeRepository;
import Shape.repository.ShapeRepository;
import Shape.view.Menu;

public class ShapeManager extends Menu<String> {

    private IShapeRepository shapeRepository;
    static String mc[] = {"Calcalator Shape", "Exit"};

    public ShapeManager() {
        super("Calculation", mc);
        shapeRepository = new ShapeRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->  {
                Retangle rectangle = shapeRepository.inputRectangle();
                Circle circle = shapeRepository.inputCircle();
                Triangle triangle = shapeRepository.inputTriangle();
                shapeRepository.display(triangle, rectangle, circle);
            }
            case 2 -> System.exit(0);
        }
    }
}