package ThreadPoolDemo;



import java.util.concurrent.*;

//四大拒绝策略
//hreadPoolExecutor.AbortPolicy()  超出最大线程数直接报错
//ThreadPoolExecutor.CallerRunsPolicy()  超出后返回到调用者的线程进行处理，哪来的回哪去
//ThreadPoolExecutor.DiscardOldestPolicy()   尝试和最早的竞争资源，争的着正常执行，争不着丢弃其余的，且不报错
//ThreadPoolExecutor.DiscardPolicy()    超出后直接丢弃其余的，且不会报错
public class ExecutorFourPolicies {

    public static void main(String[] args) {

        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()
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
