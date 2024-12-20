package concurrency_4.additionalproblems.q1;

import java.util.concurrent.Semaphore;

public class H2O {

    private final Semaphore hydrogenSemaphore = new Semaphore(2);
    private final Semaphore oxygenSemaphore = new Semaphore(0);
    private int hydrogenCount = 0; // AtomicInteger
    private final Object object = new Object();

    public H2O() {
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenSemaphore.acquire(); // Acquire one permit for hydrogen // 0 -> 2,... 2-1 = 1-1=0
        releaseHydrogen.run(); // HH0HH
        synchronized (object) {
            hydrogenCount++; // 0->1->2
            if (hydrogenCount == 2) {
                oxygenSemaphore.release(); // Release one oxygen permit when two hydrogen atoms are ready // 1
            }
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenSemaphore.acquire(); // Acquire one permit for oxygen // 0
        releaseOxygen.run(); // O
        synchronized (object) {
            hydrogenCount = 0; // Reset hydrogen count after forming a water molecule
            hydrogenSemaphore.release(2); // Release two hydrogen permits for the next water molecule
        }
    }

    public static void main(String[] args) {
        H2O h2o = new H2O();

        // lamda operators
        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O");

        // Example input: "OOHHHH" (2 oxygen and 4 hydrogen atoms)
        String input = "OOHHHH";
        //HH0HH0

        for (char c : input.toCharArray()) {
            if (c == 'H') {
                new Thread(() -> {
                    try {
                        h2o.hydrogen(releaseHydrogen); // 4 times
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            } else if (c == 'O') {
                new Thread(() -> {
                    try {
                        h2o.oxygen(releaseOxygen); // 2 times
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        }
    }
}
