package generics.problems.q2;

// Q2. Generic Array Printing Method
public class PrintArrayElements {

    public static <T> void printArray(T[] array) {
        for (T ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] strings = {"Ishan", "Vaibhav"};
        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println();
        System.out.println("Strings: ");
        printArray(strings);
    }
}
