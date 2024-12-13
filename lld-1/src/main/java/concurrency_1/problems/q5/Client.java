package concurrency_1.problems.q5;

public class Client {

    public static void main(String[] args) {
        System.out.println("I am the main class");
        Adder adder = new Adder();
        ScalerThread scalerThread1 = new ScalerThread(adder);
        Subtractor subtractor = new Subtractor();
        ScalerThread scalerThread2 = new ScalerThread(subtractor);

        scalerThread1.start();
        scalerThread2.start();
    }
}
