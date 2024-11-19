package interfaces;

// Abstract class implementing interface Shape

public abstract class ShapeDecorator implements Shape{

    protected Shape shape;

    // constructor
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
