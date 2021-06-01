package sef.module6.activity;

public class Square extends Shape {

    private double side;

    Square(double side){
        this.side = side;
    }

    public double calculateArea(){
        double area = side * side;
        return area;
    }

    public double calculatePerimeter(){
        return 4 * side;
    }
}
