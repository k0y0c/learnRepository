import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testResource {
    @Test
    public void testResource1(){
        //1.获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService accountService = (AccountService) ac.getBean("accountService");

        accountService.saveAccount();
    }
}
