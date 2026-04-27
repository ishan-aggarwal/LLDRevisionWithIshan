package concurrency_4.problems.q5;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;

    Semaphore foo = new Semaphore(1);
    Semaphore bar = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(5);
        Runnable printFoo = () -> System.out.println("foo");
        Runnable printBar = () -> System.out.println("bar");

        Thread t1 = new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t2.start();
        Thread.sleep(10000);
        t1.start();
    }
}