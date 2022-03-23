package Thread_01;

public class CreateByThread {
    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("子线程一");
            }
        };

        //Runnable的实现，也可使用Lambda表达式
        Thread t2 = new Thread(() -> System.out.println("子线程二"));


        thread.setName("线程一");
        t2.setName("线程二");
        thread.start();
        t2.start();

        System.out.println("主线程");
    }
}
