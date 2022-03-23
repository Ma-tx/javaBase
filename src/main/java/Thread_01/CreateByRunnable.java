package Thread_01;

public class CreateByRunnable {


    public static void main(String[] args) {
        //runnable的方式更加解耦，使任务和线程分离（推荐使用）
        Runnable r1 = new Runnable(){
            public void run() {
                System.out.println("子线程一");
            }
        };

        //查看Runnable，我们可以看到FunctionalInterface注解，且接口内只有一个方法，即可以使用Lambda表达式简化
        Runnable r2 = () -> {
            System.out.println("子线程二");
        };

        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r2,"t2");
        t1.start();
        t2.start();

        System.out.println("主线程");


    }
}
