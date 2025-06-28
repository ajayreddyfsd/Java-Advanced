/*
 * Why Cannot Inherit From Java Enums? (For the F Student)
 *
 * Think of Enums as special, super-fixed lists of related constants (like days of the week, or sizes S, M, L).
 *
 * 1.  **They Are Already Final:**
 * - When you make an `enum`, Java secretly makes it `final`.
 * - `final` means "this is the end of the line, no one can extend or inherit from me!"
 * - It's like saying, "These are the *only* allowed values, no more can be added by anyone else."
 *
 * 2.  **They Already Extend `java.lang.Enum`:**
 * - Every single `enum` you create automatically (behind the scenes) `extends java.lang.Enum`.
 * - In Java, a class can only `extend` (inherit from) **ONE** other class.
 * - Since your enum is already "using up" its one inheritance slot for `java.lang.Enum`, it can't inherit from anything else.
 *
 * **In short:**
 * - Enums are designed to be a fixed, closed set of values.
 * - Making them `final` and automatically extending `java.lang.Enum` prevents you from messing with that fixed nature by inheriting.
 * - It keeps enums simple, safe, and guarantees they represent a very specific, limited set of choices.
 */