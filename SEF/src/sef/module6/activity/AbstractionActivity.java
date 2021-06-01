package sef.module6.activity;

public class AbstractionActivity {

    public static void main (String[] args) {
        Shape p1 = new Square(5);
        Shape p2 = new Rectangle(5, 6);

        p1.setColor("Red");

        System.out.println("*** Prints information for Square");
        System.out.println("Colour of Square: " + p1.getColor());
        System.out.println("Area of Square: " + p1.calculateArea());
        System.out.println("Perimeter of Square: " + p1.calculatePerimeter());

        System.out.println("---------------------------------------");
        p2.setColor("Yellow");
        System.out.println("*** Prints information for Rectangle");
        System.out.println("Colour of Square: " + p2.getColor());
        System.out.println("Area of Square: " + p2.calculateArea());
        System.out.println("Perimeter of Square: " + p2.calculatePerimeter());
    }

}
