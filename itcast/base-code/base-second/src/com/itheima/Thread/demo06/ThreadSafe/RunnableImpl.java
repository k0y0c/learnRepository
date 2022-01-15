package com.itheima.Thread.demo06.ThreadSafe;
//实现卖票案例
public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
        while (true){
            //先进行判断是否存在
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票，ticket--
                System.out.println(Thread.currentThread().getName() + "-->" + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }

    }
}
