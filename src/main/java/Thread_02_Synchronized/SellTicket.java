package Thread_02_Synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class SellTicket {
    public static void main(String[] args){
        //设置初始票数
        TicketWindow ticketWindow = new TicketWindow(20000);

        List<Thread> list = new ArrayList<>();
        // 用来存储买出去多少张票
        List<Integer> sellCount = new Vector<>();
        for (int i = 0; i < 20000; i++) {        //循环2000次，确保票卖完了
            Thread t = new Thread(() -> {
                // 分析这里的竞态条件
                int count = ticketWindow.sell(randomAmount());
                try {
                    Thread.sleep(randomAmount());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //列表存储每次的卖票数
                sellCount.add(count);
            });
            list.add(t);
            t.start();
        }
        list.forEach((t) -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 买出去的票求和
        System.out.println("selled count："+sellCount.stream().mapToInt(c -> c).sum());
//        log.debug("selled count:{}",sellCount.stream().mapToInt(c -> c).sum());
        // 剩余票数
        System.out.println("remainder count："+ticketWindow.getCount());
//        log.debug("remainder count:{}", ticketWindow.getCount());
    }
    // Random 为线程安全
    static Random random = new Random();
    // 随机 1~5
    public static int randomAmount() {
        return random.nextInt(5) + 1;
    }
}

//票类
class TicketWindow {

    private int count;

    //设置票数
    public TicketWindow(int count) {
        this.count = count;
    }

    //得到余票
    public int getCount() {
        return count;
    }

    //对票进行操作
    public int sell(int amount) {
        if (this.count >= amount) {
            this.count -= amount;
            return amount;
        } else {
            return 0;
        }
    }
}


