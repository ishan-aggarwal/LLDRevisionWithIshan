# Maximum Element Finder Using Bounded Generics (Assignment)

## Problem Statement

Develop a method named `findMax` that utilizes bounded generics to identify and return the maximum element from an
array. The elements of the array must implement the `Comparable` interface, ensuring the method works with any type that
has a natural ordering. The method should handle `null` or empty arrays gracefully, returning `null` in such cases.

## Instructions

1. Implement the `findMax` method within the `FindMaxElement` class. This method should be generic and use bounded
   generics to restrict its parameters to types that extend the `Comparable` interface.
2. The `findMax` method should accept an array of a generic type that extends `Comparable` and return the maximum
   element found in the array.
3. In the case of a `null` or empty array, the method should return null without throwing an exception.