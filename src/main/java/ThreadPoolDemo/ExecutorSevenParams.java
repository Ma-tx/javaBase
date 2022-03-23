package ThreadPoolDemo;



import java.util.concurrent.*;

//线程池 七大参数
//      public ThreadPoolExecutor(int corePoolSize,
//              int maximumPoolSize,
//              long keepAliveTime,
//              TimeUnit unit,
//              BlockingQueue<Runnable> workQueue,
//              ThreadFactory threadFactory) {
//              this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
//              threadFactory, defaultHandler);
//              }
public class ExecutorSevenParams {

    public static void main(String[] args) {

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        try {
            for (int i = 0; i < 20; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"   ok");
                });

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }


    }



}
