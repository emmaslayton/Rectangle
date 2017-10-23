/**
 * @author Emma Slayton
 *  Created: 10/21/17
 *  Last updated: 10/22/17
 *
 *  Project 9; CSC201-004N
 *  Assignment 9.1
 */

public class Rectangle {
    /** Main method */
    public static void main(String[] args) {
        // Create a Rectangle with a width of 1 and height of 1
        Rectangle rectangle1 = new Rectangle();
        System.out.println("=== Rectangle #1 ===");
        System.out.println("Width of Rectangle: " + rectangle1.width);
        System.out.println("Height of Rectangle: " + rectangle1.height);
        System.out.println("Area of Rectangle: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle1.getPerimeter());
        System.out.println(" ");
        System.out.println(" ");

        // Create a rectangle with a width of 4 and a height of 40
        Rectangle rectangle2 = new Rectangle(4,40);
        System.out.println("=== Rectangle #2 ===");
        System.out.println("Width of Rectangle: " + rectangle2.width);
        System.out.println("Height of Rectangle: " + rectangle2.height);
        System.out.println("Area of Rectangle: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle2.getPerimeter());
        System.out.println(" ");
        System.out.println(" ");

        // Create a rectangle with a width of 3.5 and a height of 35.9
        Rectangle rectangle3 = new Rectangle(3.5,35.9 );
        System.out.println("=== Rectangle #3 ===");
        System.out.println("Width of Rectangle: " + rectangle3.width);
        System.out.println("Height of Rectangle: " + rectangle3.height);
        System.out.println("Area of Rectangle: " + rectangle3.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle3.getPerimeter());
        System.out.println(" ");

    }

    double width;
    double height;

    /** Construct a rectangle with a width of 1 and height of 1 */
    Rectangle() {
        width = 1;
        height = 1;
    }

    /** Construct a rectangle with a specified width and height */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /** Return the area of this rectangle*/
    double getArea() {
        return (width * height);
    }

    /** Return the perimeter of this rectangle */
    double getPerimeter() {
        return (2 * (width + height));
    }

    /** Set new width for this rectangle */
    void setWidth(double newWidth) {
        width = newWidth;
    }

    /** Set new height for this rectangle */
    void setHeight(double newHeight) {
        height = newHeight;
    }
}
