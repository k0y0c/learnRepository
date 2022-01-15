package com.itheima.ui;
import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //AccountService as2 = (AccountService) ac.getBean("accountService");
//        System.out.println(as);
//        AccountDao adao = ac.getBean("accountDao", AccountDao.class);
//        System.out.println(adao);
        //System.out.println(as == as2);
        as.saveAccount();
        ac.close();
    }

}
