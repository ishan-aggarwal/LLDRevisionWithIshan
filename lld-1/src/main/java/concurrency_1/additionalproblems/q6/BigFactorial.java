package concurrency_1.additionalproblems.q6;

import java.math.BigInteger;

public class BigFactorial extends Thread {
    private final int number;
    private BigInteger factorial;

    public BigFactorial(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        factorial = calculateFactorial(number);
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    private BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        BigFactorial calculator = new BigFactorial(100);
        calculator.start();
        calculator.join(); // Wait for the thread to finish

        System.out.println("Factorial of 100: " + calculator.getFactorial());
    }
}
