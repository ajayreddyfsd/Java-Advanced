/*
Java Lambda Expression Rules:

1. Single Abstract Method (SAM) Interface
   - Lambdas can only be used with functional interfaces,
     i.e., interfaces with exactly one abstract method.

2. Parameter Types Can Be Omitted
   - Types are optional if they can be inferred.
     Examples:
       (int a, int b) -> a + b    // explicit types
       (a, b) -> a + b            // inferred types (preferred)

3. Parentheses Around Parameters
   - No parameters: use empty parentheses ()
       () -> 42
   - One parameter without type: parentheses optional
       x -> x * x
   - Multiple parameters or types: parentheses required
       (a, b) -> a + b

4. Lambda Body
   - Single expression: no braces needed, expression value is returned
       (a, b) -> a + b
   - Multiple statements: use braces and explicit return
       (a, b) -> {
           int sum = a + b;
           return sum;
       }

