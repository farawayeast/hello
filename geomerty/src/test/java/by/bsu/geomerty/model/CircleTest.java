package by.bsu.geomerty.model;

import bsu.geomerty.model.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testArea(){
        Circle circle = new Circle(1,1,-1);
        double area = circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
    }

    @Test
    public void testAreanWrong(){
        Circle circle = new Circle(2,5,-7);
        double arean = circle.calculateArea();
        Assert.assertEquals(153.93,arean,0.01);
    }

    @Test
    public void testPerimeter(){
        Circle circle = new Circle(1,1,-1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(-6.28,perimeter,0.01);
    }

    @Test
    public void testPerimeterWrong(){
        Circle circle = new Circle(1,1,-1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(-6.28,perimeter,0.01);
    }
}
