/**
 * @Description
 * @Author wzh
 * @Date 2019/12/24 10:36
 * @Version 2.10
 **/
public class Test001 {
    public static void main(String[] args) {
        /**
         * 匿名内部类写法
         */
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类形式-子线程："+Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
        /**
         * lambda 写法
         */
        Runnable runnable1 = ()->{
            System.out.println("lambda形式-子线程"+Thread.currentThread().getName());
        };
        new Thread(runnable1).start();
        /**
         * lambda 简单写法
         */
        new Thread(()->{
            System.out.println("lambda-简单-形式-子线程"+Thread.currentThread().getName());
        }).start();
    }
}
