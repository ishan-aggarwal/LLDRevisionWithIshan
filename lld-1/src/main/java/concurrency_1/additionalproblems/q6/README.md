# Big Factorial (Assignment)

## Problem Statement

Implement a thread that computes factorials of a large number. Since the result can be significantly large, you should
use the `BigInteger` class to store the result and perform the computation.

## Instructions

- **Implement the `BigFactorial` Class**: Design this class to utilize multi-threading for computing the factorial of
  large numbers, specifically by extending the `Thread` class. Incorporate the `BigInteger` class for handling large
  results. Detailed requirements for the class include:
    1. An `int` field to hold the number for factorial computation.
    2. A `BigInteger` field to store the computed factorial.
    3. A constructor to initialize the class with the target number.
    4. Essential methods to perform the computation in a separate thread and retrieve the result.
    5. The class should override the `run()` method of the `Thread` class to perform the factorial computation within a
       separate thread.

- The class should efficiently calculate the factorial of any number provided, ensuring thread-safe execution and
  resource management, by extending the Thread class and overriding the `run()` method.