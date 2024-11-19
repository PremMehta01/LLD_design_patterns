package shapes;

import interfaces.Shape;
import interfaces.ShapeDecorator;

// extending abstract class

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        // calling parent constructor
        super(shape);
    }

    @Override
    public void draw() {
        // shape object is accessible from parent abstract class
        shape.draw();
        setBorder(shape);
    }

    private void setBorder(Shape shape) {
        System.out.println("Border Color: Red");
    }
}
