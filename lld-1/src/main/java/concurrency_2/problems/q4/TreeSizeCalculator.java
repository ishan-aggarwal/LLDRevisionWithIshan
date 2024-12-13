package concurrency_2.problems.q4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    Node root;
    ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) return 0;
        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, executorService);

        Future<Integer> leftSizeFuture = executorService.submit(leftTree);
        Future<Integer> rightSizeFuture = executorService.submit(rightTree);

        return 1 + leftSizeFuture.get() + rightSizeFuture.get();
    }
}
