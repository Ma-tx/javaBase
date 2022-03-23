package ThreadPoolDemo;

import java.util.concurrent.*;

//CPU密集型
//IO密集型
public class ExecutorOfCPUOrIO {

    public static void main(String[] args) {

        //定义 maximumPoolSize的多少
        //1、CPU密集型 :几核就填几       通过如下代码获取cpu核数
        int cpu_num = Runtime.getRuntime().availableProcessors();
        System.out.println(cpu_num);

        //2、IO密集型：设定的数量大于十分消耗IO的线程数

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
