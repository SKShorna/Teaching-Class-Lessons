# Title: Java Method Overloading and Overriding.

**Objective**: Understand and practice method overloading and overriding in Java.

**Prerequisites**: Basic knowledge of Java programming.

**Duration**: Approximately - 1  hour.

### Outcome:

* Implement method overloading and overriding in Java.
* Gain a clear understanding of method overloading and overriding.
* Explore the flexibility of method design through overloading.
* Develop problem-solving skills and grasp object-oriented design principles through practical exercises.

Note: If there is any confusion? Please feel free to reach me over email or make an appointment for a one-on-one discussion.

Now, let's do a combination of exercises involving method overloading and overriding:

### Part 1

#### Exercise 1: Method Overloading

1. Create a new class called ***MathOperations*** with a static method called ***add*** that takes two integer parameters and returns their sum.

``` java
  class MathOperations {
    static int add(...){
      // do your code here
    }
  }
```

2. Overload the ***add*** method to take two double parameters and return their sum.

``` java
  class MathOperations {
    static int add(...){
      // do your code here
    }
    
    
    static double add(...){
        // do your code here
    }
  }

```

3. In your main method, create instances of ***MathOperations*** and demonstrate using both overloaded add methods to perform integer and double addition.

```java

   public class Overloadride {

       public static void main(String[] args) {
         
        MathOperations.add(pass value here);
        MathOperations.add(pass value here);

        System.out.println("Integer addition: " +....);
        System.out.println("Double addition: " + );
    }
   }

```

### Part 2

#### Exercise 2: Method Overriding.

1. Create a new class called ***Shape*** with a method ***calculateArea*** that prints "Calculating area of a shape."

```java

class Shape {
    void calculateArea() {
        //do your code here
    }
}

```

2. Create a subclass of ***Shape*** called ***Circle*** and override the ***calculateArea** method to calculate and print the area of a circle.

```java
class Circle extends Shape {
    @Override
    void calculateArea() {
        // Add code to calculate and print the area of a circle (e.g., using a formula).
    }
}

```
3. Create another subclass of ***Shape*** called ***Rectangle*** and override the ***calculateArea*** method to calculate and print the area of a rectangle.

4. In your main method, create instances of ***Circle*** and ***Rectangle*** and call their ***calculateArea*** methods to demonstrate method overriding.

```java
public class ShapeDemo {
    public static void main(String[] args) {
        
         // Calls the overridden method in Circle
         // Calls the overridden method in Rectangle
    }
}

```

### Part 3

#### Exercise 3: Advanced Method Overloading and Overriding.

1. Create a new class called ***Calculator*** with the following overloaded methods:

   * add that takes two integers and returns their sum.
   * add that takes two doubles and returns their sum.
   * add that takes an integer and a double, adds them, and returns the result as a double.
   * subtract that takes two integers and returns their difference.
   * subtract that takes two doubles and returns their difference.
   * multiply that takes two integers and returns their product.
   * multiply that takes two doubles and returns their product.
   * divide that takes two integers and returns the result as a double.
   * divide that takes two doubles and returns the result as a double.

2. Create a subclass of ***Calculator*** called ***ScientificCalculator*** and add the following methods:

   * square that takes an integer and returns its square.
   * squareRoot that takes a double and returns its square root.

3. In your main method, create instances of ***Calculator*** and ***ScientificCalculator*** and demonstrate using their methods for various mathematical operations.

### Submission

Upload a file or files (.java)

Again, please get in touch with me over email or make an appointment for a one-on-one discussion. Happy Learning! 
