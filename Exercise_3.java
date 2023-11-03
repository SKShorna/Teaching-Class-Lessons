/* Exercise 3: Advanced Method Overloading and Overriding
Create a new class called Calculator with the following overloaded methods:
add that takes two integers and returns their sum.
add that takes two doubles and returns their sum.
add that takes an integer and a double, adds them, and returns the result as a double.
subtract that takes two integers and returns their difference.
subtract that takes two doubles and returns their difference.
multiply that takes two integers and returns their product.
multiply that takes two doubles and returns their product.
divide that takes two integers and returns the result as a double.
divide that takes two doubles and returns the result as a double.
2. Create a subclass of Calculator called ScientificCalculator and add the following methods:
square that takes an integer and returns its square.
squareRoot that takes a double and returns its square root.
3. In your main method, create instances of Calculator and ScientificCalculator and demonstrate using their methods for various mathematical operations. */


// solution:

// Create a new class called Calculator with the following overloaded methods:


class Calculator {
    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        return x + y;
    }

    double add(int x, double y) {
        return x + y;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    double subtract(double x, double y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Handle division by zero
        }
        return (double) x / y;
    }

    double divide(double x, double y) {
        if (y == 0.0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Handle division by zero
        }
        return x / y;
    }
}

//Create a subclass of Calculator called ScientificCalculator and add the following methods:

class ScientificCalculator extends Calculator {
    int square(int x) {
        return x * x;
    }

    double squareRoot(double x) {
        if (x < 0.0) {
            System.out.println("Square root of a negative number is not allowed.");
            return Double.NaN; // Handle square root of negative numbers
        }
        return Math.sqrt(x);
    }
}

// In your main method, create instances of Calculator and ScientificCalculator and demonstrate using their methods for various mathematical operations.

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator basicCalculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        // Perform basic operations
        System.out.println("Addition: " + basicCalculator.add(5, 3));
        System.out.println("Subtraction: " + basicCalculator.subtract(10, 4));
        System.out.println("Multiplication: " + basicCalculator.multiply(6, 7));
        System.out.println("Division: " + basicCalculator.divide(12, 3));

        // Perform scientific operations
        System.out.println("Square: " + scientificCalculator.square(4));
        System.out.println("Square Root: " + scientificCalculator.squareRoot(25));
    }
}

// This program demonstrates method overloading in the Calculator class and method overriding in the ScientificCalculator subclass for various mathematical operations. It also handles special cases such as division by zero and square roots of negative numbers.
