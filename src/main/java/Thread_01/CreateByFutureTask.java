package Thread_01;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateByFutureTask {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        // 该方式带有返回值
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>(
                new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {

                        System.out.println("子线程");
                        Thread.sleep(2000);
                        return 100;
                    }
                }
        );

        Thread thread = new Thread(integerFutureTask);
        thread.start();

        System.out.println(integerFutureTask.get());

    }
}
