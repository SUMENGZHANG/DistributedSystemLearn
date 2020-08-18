package TheBeautyOfConcurrencyProgramming.RealizeThreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by sumengzhang on 18/8/20 1:43 AM
 *
 * pros: 有返回值
 */
public class MethodToRealizeThread03 implements Callable {
    @Override
    public Object call() throws Exception {
        return "This is child thread";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new MethodToRealizeThread03());
        new Thread(futureTask).start();
        String res = futureTask.get();
        System.out.println(res);
    }
}
