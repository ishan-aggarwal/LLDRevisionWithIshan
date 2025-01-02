package concurrency_2.additionalproblems.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSortCallable implements Callable<List<Integer>> {

    private final List<Integer> unsortedArray;
    private final ExecutorService executorService;

    public MergeSortCallable(List<Integer> unsortedArray, ExecutorService executorService) {
        this.unsortedArray = unsortedArray;
        this.executorService = executorService;
    }

    public List<Integer> sort() throws ExecutionException, InterruptedException {
        if (unsortedArray.size() <= 1) {
            return unsortedArray;
        }
        int n = unsortedArray.size();
        int mid = n / 2;

//        System.out.printf("Sorting %s with mid:%s and size:%s on thread %s\n",
//                unsortedArray, mid, n, Thread.currentThread().getName());

        List<Integer> leftUnsorted = new ArrayList<>();
        List<Integer> rightUnsorted = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftUnsorted.add(unsortedArray.get(i));
        }

        for (int i = mid; i < n; i++) {
            rightUnsorted.add(unsortedArray.get(i));
        }

        Future<List<Integer>> leftSortedFuture = executorService.submit(new MergeSortCallable(leftUnsorted, executorService));
        Future<List<Integer>> rightSortedFuture = executorService.submit(new MergeSortCallable(rightUnsorted, executorService));

        List<Integer> leftSorted = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();

        List<Integer> sortedArray = mergeSortedSubArrays(leftSorted, rightSorted);
        return sortedArray;
    }

    private static List<Integer> mergeSortedSubArrays(List<Integer> leftSorted, List<Integer> rightSorted) {
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                sortedArray.add(leftSorted.get(i));
                i++;
            } else {
                sortedArray.add(rightSorted.get(j));
                j++;
            }
        }
        while (i < leftSorted.size()) {
            sortedArray.add(leftSorted.get(i));
            i++;
        }
        while (j < rightSorted.size()) {
            sortedArray.add(rightSorted.get(j));
            j++;
        }
        return sortedArray;
    }

    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }
}