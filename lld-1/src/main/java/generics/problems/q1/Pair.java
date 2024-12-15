package generics.problems.q1;
// Q1. Generic Pair
public class Pair<T, U> {
    private T first;
    private U second;

    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> integerStringPair = new Pair<>(10, "Ishan");
        System.out.println("Integer-String: " +
                integerStringPair.getFirst() + " " + integerStringPair.getSecond());
    }

}
