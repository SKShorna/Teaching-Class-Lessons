//Exercise 1: Method Overloading
//Create a new class called MathOperations with a static method called add that takes two integer parameters and returns their sum.
//Overload the add method to take two double parameters and return their sum.
//In your main method, create instances of MathOperations and demonstrate using both overloaded add methods to perform integer and double addition.

//Solution:

package main;

class MathOperations {
    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }
}

public class Overloadride {
    public static void main(String[] args) {
        int integerResult = MathOperations.add(2, 3);
        double doubleResult = MathOperations.add(2.3, 5.5);

        System.out.println("Integer addition: " + integerResult);
        System.out.println("Double addition: " + doubleResult);
    }
}


/*

Explanations: 

We create a new class named MathOperations.

In MathOperations, we define two overloaded add methods. One takes two integer parameters, and the other takes two double parameters, performing addition for each data type.

In the Overloadride class's main method, we demonstrate using both overloaded add methods to perform integer and double addition by calling them directly on the MathOperations class.

When you run this program, it will perform integer and double addition using the overloaded methods and display the results.





*/
