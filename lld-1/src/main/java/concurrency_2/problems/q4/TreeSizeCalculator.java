package concurrency_2.problems.q4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    Node root;
    ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executor = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) return 0;
        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, executor);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, executor);

        Future<Integer> leftSizeFuture = executor.submit(leftTree);
        Future<Integer> rightSizeFuture = executor.submit(rightTree);

        return 1 + leftSizeFuture.get() + rightSizeFuture.get();
    }
}