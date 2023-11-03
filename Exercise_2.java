/*
Part 2
Exercise 2: Method Overriding
Create a new class called Shape with a method calculateArea that prints "Calculating area of a shape."
Create a subclass of Shape called Circle and override the calculateArea method to calculate and print the area of a circle.
Create another subclass of Shape called Rectangle and override the calculateArea method to calculate and print the area of a rectangle.
In your main method, create instances of Circle and Rectangle and call their calculateArea methods to demonstrate method overriding.

*/

//Solution:


// Create a new class called Shape with a method calculateArea that prints "Calculating area of a shape."


class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a shape.");
    }
}


// Create a subclass of Shape called Circle and override the calculateArea method to calculate and print the area of a circle.


class Circle extends Shape {
    @Override
    void calculateArea() {
        System.out.println("Calculating area of a circle.");
        // Add code to calculate and print the area of a circle (e.g., using a formula).
    }
}


// Create another subclass of Shape called Rectangle and override the calculateArea method to calculate and print the area of a rectangle.

class Rectangle extends Shape {
    @Override
    void calculateArea() {
        System.out.println("Calculating area of a rectangle.");
        // Add code to calculate and print the area of a rectangle (e.g., using a formula).
    }
}


// In your main method, create instances of Circle and Rectangle and call their calculateArea methods to demonstrate method overriding.


public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.calculateArea(); // Calls the overridden method in Circle
        rectangle.calculateArea(); // Calls the overridden method in Rectangle
    }
}

// When you run this program, it will demonstrate method overriding by calling the appropriate calculateArea method for each shape


