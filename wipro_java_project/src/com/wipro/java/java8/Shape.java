package com.wipro.java.java8;

@FunctionalInterface
interface Polygon {
    // Only 1 abstract method
    public void sides(int sides);

    // Any number of default methods
    default String show() {
        return "Showing the polygon figure";
    }

    default String show(String fig) {
        return fig;
    }

    // Any number of static methods
    static int area(int num1) {
        return num1;
    }

    static int perimeter(int num2) {
        return num2;
    }
}

public class Shape implements Polygon {

    // Implementing the abstract method from the Polygon interface
    @Override
    public void sides(int sides) {
        System.out.println("This shape has " + sides + " sides.");
    }

    public static void main(String[] args) {
        // Creating an instance of Shape
        Shape square = new Shape();

        // Using the implemented method from Polygon interface
        square.sides(4); // Example: Square has 4 sides

        // Using default methods
        System.out.println(square.show()); // Shows "Showing the polygon figure"
        System.out.println(square.show("Displaying a square")); // Custom string

        // Using static methods from Polygon interface
        System.out.println("Area of square: " + Polygon.area(4)); // Area of square with side length 4
        System.out.println("Perimeter of square: " + Polygon.perimeter(4)); // Perimeter of square with side length 4
        
        // Creating an instance of Shape
        Shape rectangle = new Shape();

        // Using the implemented method from Polygon interface
        rectangle.sides(4); // Example: Rectangle has 4 sides

        // Using default methods
        System.out.println(rectangle.show()); // Shows "Showing the polygon figure"
        System.out.println(rectangle.show("Displaying a rectangle")); // Custom string

        // Using static methods from Polygon interface
        System.out.println("Area of rectangle: " + Polygon.area(4)); // Area of rectangle with side length 4
        System.out.println("Perimeter of rectangle: " + Polygon.perimeter(8)); // Perimeter of rectangle with side length 4
    }
}
