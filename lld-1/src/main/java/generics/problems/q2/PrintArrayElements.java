package generics.problems.q2;

public class PrintArrayElements {
    // Generic method to print elements of an array
    // Hint for the learner - print space after each element,don't print newline after the last element.

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "orange"};
        Integer[] emptyArray = {};
        Integer[] singleElement = {42};
        Double[] doubles = {1.1, 2.2, 3.3};
        Character[] characters = {'a', 'b', 'c'};
        Integer[] arrayWithNulls = {1, null, 3};

        // Call the 'printArray' method to print elements of the 'numbers' array.
        System.out.print("Numbers: ");
        printArray(numbers);
        System.out.println();

        // Call the 'printArray' method to print elements of the 'words' array.
        System.out.print("Words: ");
        printArray(words);
        System.out.println();

        // Call the 'printArray' method to print elements of the empty array.
        System.out.print("Empty Array: ");
        printArray(emptyArray);
        System.out.println();

        // Call the 'printArray' method to print elements of the single element array.
        System.out.print("Single Element: ");
        printArray(singleElement);
        System.out.println();

        // Call the 'printArray' method to print elements of the double array.
        System.out.print("Doubles: ");
        printArray(doubles);
        System.out.println();

        // Call the 'printArray' method to print elements of the character array.
        System.out.print("Characters: ");
        printArray(characters);
        System.out.println();

        // Call the 'printArray' method to print elements of the array with nulls.
        System.out.print("Array With Nulls: ");
        printArray(arrayWithNulls);
        System.out.println();
    }
}