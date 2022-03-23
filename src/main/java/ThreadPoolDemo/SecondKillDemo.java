package ThreadPoolDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SecondKillDemo {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPool= new ThreadPoolExecutor(
                3,5,1, TimeUnit.MINUTES,
                new LinkedBlockingDeque<>(15));
        for (int i = 0; i < 20; i++) {
            MyGoods myTest = new MyGoods("aaa——" + i + "号");
            threadPool.submit(myTest);
        }
        threadPool.shutdown();

    }
}
