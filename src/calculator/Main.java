package calculator;

public class Main {
    //Main Class with Lambda Expression for Multiplication
    public static void main(String[] args) {
        // Lambda expression that implements the Calculator interface to perform multiplication
        /*
        In the main method, a lambda expression is used to provide an implementation for the
        Calculator interface. The lambda expression (a, b) -> a * b takes two integers a
        and b and returns their product.
         */
        Calculator multiply = (a, b) -> a * b;

        // Example of using the lambda expression to multiply two integers
        int num1 = 5;
        int num2 = 3;
        int result = multiply.operate(num1, num2);

        // Print the result
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
    }
}

