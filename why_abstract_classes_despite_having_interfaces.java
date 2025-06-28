/*
 * Why Abstract Classes when we have Interfaces? (For the F Student)
 *
 * Think of it simply:
 *
 * **Interfaces:**
 * - Are like a **CONTRACT** or a **TO-DO LIST**.
 * - They say: "Anything that uses me *MUST* have these methods."
 * - They only define *WHAT* something can do (e.g., `void attack();`).
 * - They CANNOT have actual code inside their methods (mostly).
 * - Good for defining common *behaviors* across unrelated types (e.g., `Car` and `Dog` can both be `Moveable`).
 *
 * **Abstract Classes:**
 * - Are like a **PARTIAL BLUEPRINT** or a **STARTER KIT**.
 * - They can have actual **CODE** and **VARIABLES** that are common to many subclasses.
 * - They can say: "All my children *will* have this `name` variable and *will* use this default `greet()` method."
 * - BUT, they can also force children to implement certain methods (like interfaces).
 * - They define *WHAT* something can do AND provide some *HOW* (default implementation).
 * - Good for defining common *characteristics* and *behaviors* for related types (e.g., `Dog`, `Cat`, `Bird` are all `Animal`s).
 *
 * **In short:**
 * - Use an **Interface** when you want to define a common set of *actions* without caring about shared data or default code.
 * - Use an **Abstract Class** when you want to define common *actions* AND share common *data* or *default code* among related subclasses, but still force them to implement some specific behaviors.
 *
 * An abstract class lets you share more code upfront than an interface.
 */