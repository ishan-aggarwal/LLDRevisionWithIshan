package concurrency_2.problems.q1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ArrayCreator arrayCreator = new ArrayCreator(num);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<List<Integer>> futureResult = executorService.submit(arrayCreator);
        List<Integer> list = futureResult.get();
        System.out.println(list);
        executorService.shutdown();
    }
}
