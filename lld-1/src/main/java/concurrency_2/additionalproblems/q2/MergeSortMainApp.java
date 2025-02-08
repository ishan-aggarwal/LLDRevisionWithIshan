package concurrency_2.additionalproblems.q2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortMainApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newCachedThreadPool();
        List<Integer> list=List.of(7,8,1,9,3,4,3,0,6,10);
//        List<Integer> list = List.of(3, 2, 1);

        MergeSortCallable mergeSorted = new MergeSortCallable(list, es);
        Future<List<Integer>> ans = es.submit(mergeSorted);
        System.out.println(ans.get());
        es.shutdownNow();
    }
}