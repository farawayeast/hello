package bsu.geomerty.model;

public class Triangle implements  Shape{

    private  double x1,x2,x3;
    private  double y1,y2,y3;


    public  Triangle(double x1,double x2,double x3,double y1,double y2,double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;

    }

    @Override
    public double calculateArea() {

        double area =Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double a=Math.sqrt(Math.pow(Math.abs(x1-x2),2)+Math.pow(Math.abs(y1-y2),2));
        double b=Math.sqrt(Math.pow(Math.abs(x1-x3),2)+Math.pow(Math.abs(y1-y3),2));
        double c=Math.sqrt(Math.pow(Math.abs(x3-x2),2)+Math.pow(Math.abs(y3-y2),2));
        double perimeter= a+b+c;
        return perimeter;
    }
}
