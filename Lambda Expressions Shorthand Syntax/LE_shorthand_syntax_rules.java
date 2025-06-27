/*
================================================================================
                   🔁 Java Lambda Expression Shortcut Syntax (Method References)
================================================================================

A method reference is a **shortcut** for a lambda expression that just **calls a method**.
It uses the `::` operator.

Only use method reference **when the lambda body does nothing except call a method**.

-------------------------------------------------------------------------------
✅ WHEN TO USE METHOD REFERENCES
-------------------------------------------------------------------------------
Use method reference instead of lambda if:

🔹 The lambda only calls a method, like:
       x -> ClassName.staticMethod(x)
       x -> x.instanceMethod()
       () -> new ClassName()

Then, replace with:
       ClassName::staticMethod
       ClassName::instanceMethod
       ClassName::new

-------------------------------------------------------------------------------
❌ WHEN NOT TO USE METHOD REFERENCES
-------------------------------------------------------------------------------
Don’t use `::` if the lambda:
🔸 Has more than one statement
🔸 Contains logic, branching, or multiple method calls
🔸 Needs variable manipulation or inline conditions

Example: ❌ Cannot be replaced
    msg -> {
        System.out.println("Info:");
        System.out.println(msg);
    }

-------------------------------------------------------------------------------
🧠 FOUR TYPES OF METHOD REFERENCES
-------------------------------------------------------------------------------

1️⃣ Static method reference
-----------------------------
Lambda:         (a, b) -> Integer.sum(a, b)
Shortcut:       Integer::sum

2️⃣ Instance method of a specific object
----------------------------------------
Lambda:         msg -> System.out.println(msg)
Shortcut:       System.out::println

3️⃣ Instance method of an arbitrary object of a particular type
---------------------------------------------------------------
Lambda:         s -> s.toUpperCase()
Shortcut:       String::toUpperCase

4️⃣ Constructor reference
--------------------------
Lambda:         () -> new ArrayList<>()
Shortcut:       ArrayList::new

-------------------------------------------------------------------------------
✅ Summary Rule:
Use method reference if lambda body is just ONE method call with same arguments.
-------------------------------------------------------------------------------
*/
