package concurrency_1.problems.q1;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Adder adder = new Adder(num1, num2);
        ScalerThread scalerThread = new ScalerThread(adder);
        scalerThread.start();
    }
}
