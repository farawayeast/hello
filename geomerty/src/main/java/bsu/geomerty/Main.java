package bsu.geomerty;

import bsu.geomerty.model.Circle;
import bsu.geomerty.model.Rectangle;
import bsu.geomerty.model.Triangle;
import bsu.geomerty.view.ShapePrint;

public class Main {
    public static void main(String[] args) {
        ShapePrint printer = new ShapePrint();

        Circle circle = new Circle(1,5,10);
        printer.print(circle);

        Rectangle rectangle = new Rectangle(3,8,3,8);
        printer.print(rectangle);

        Triangle triangle = new Triangle(3,6,3,3,3,7);
        printer.print(triangle);



    }
}
