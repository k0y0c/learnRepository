package com.itheima.test;
import com.itheima.Junit.demo01.Junit.Calcultor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalcultorTest {
    /*
        初始化方法：
        用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }
     /*
        释放资源方法
        在所有测试方法执行之后，都会自动执行该方法
     */
    @After
    public void close(){
       System.out.println("close...");
    }
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");
        //1.创建计算器对象
        Calcultor c = new Calcultor();
        //2.调用add方法
        int result = c.add(1,2);
        //System.out.println(result);

        //3.断言 我断言这个结果
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
        //1.创建计算器对象
        Calcultor c = new Calcultor();
        //2.调用add方法
        int result = c.sub(1,2);
        //3.断言 我断言这个结果
        Assert.assertEquals(-1,result);
        System.out.println("testSub...");
    }
}
