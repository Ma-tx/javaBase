package ThreadPoolDemo;

public class MyGoods implements Runnable{
    private static int id = 10;
    private String username;

    public MyGoods(String username){
        this.username = username;
    }



    //这是一个测试的demo
    @Override
    public void run() {
        System.out.println("用户："+username+"进入线程"+Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (MyGoods.class){

            if(id>0){
                System.out.println("用户："+username+"使用线程"+Thread.currentThread().getName()+"抢到了商品："+id-- );
            }else{
                System.out.println("用户："+username+"抢购失败");
            }

        }



    }
}
