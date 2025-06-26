@FunctionalInterface
interface MyFunction {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {

        //LEs are same as in js or py
        //just that, we need something to attach them to
        //in this case, it is functional interface

        //also while calling that LE
        //we need two things, the LEs declared name as well as the abstract method's name too. BOTH ! 


        
        
        // Lambda Expressions (LEs) in Java are similar to those in JavaScript or Python.
        // The main difference is that in Java, lambdas must be attached to a Functional Interface (FI).

        // When calling a lambda, you don't actually call the lambda by name,
        // but you call the abstract method defined in the Functional Interface through the variable referencing the lambda.

        // So, you use the variable name (which holds the lambda) to invoke the Functional Interface's single abstract method.



        // Lambda expression to add two numbers
        MyFunction add = (a, b) -> a + b;

        // Lambda expression to multiply two numbers
        MyFunction multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(5, 3));      // Output: 8
        System.out.println("Multiplication: " + multiply.operate(5, 3)); // Output: 15
    }
}
