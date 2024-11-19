import interfaces.Shape;
import shapes.Circle;
import shapes.Rectangle;
import shapes.RedShapeDecorator;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println();
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println();
        redRectangle.draw();

    }
}