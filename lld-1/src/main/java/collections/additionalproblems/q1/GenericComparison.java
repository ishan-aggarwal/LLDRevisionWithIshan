package collections.additionalproblems.q1;

public class GenericComparison {

    // Generic method to compare two objects of any comparable type
    public static <T extends Comparable<T>> int compare(T obj1, T obj2) {
        return obj1.compareTo(obj2);
    }

    public static void main(String[] args) {
        // Call the 'compare' method to compare two Integer objects
        int resultInt1 = compare(5, 10);
        System.out.println("Comparison result for integers: " + resultInt1);

        int resultInt2 = compare(-33, -33);
        System.out.println("Comparison result for integers: " + resultInt2);

        // Call the 'compare' method to compare two String objects
        int resultStr1 = compare("apple", "banana");
        System.out.println("Comparison result for strings: " + resultStr1);

        int resultStr2 = compare("mango", "banana");
        System.out.println("Comparison result for strings: " + resultStr2);

        int resultStr3 = compare("mango", "mango");
        System.out.println("Comparison result for strings: " + resultStr3);

        // Double comparison
        int resultDouble = compare(10.5, 10.5);
        System.out.println("Comparison result for doubles: " + resultDouble);

        // Character comparison
        int resultChar = compare('a', 'b');
        System.out.println("Comparison result for characters: " + resultChar);
    }
}
