import com.spring.controller.BookController;
import com.spring.proxy.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-datasource.xml")
public class AopTest {
//    @Test
//    public void test1(){
//        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
//        Calculator calculator = ioc.getBean(Calculator.class);
//        calculator.div(1, 1);
//
//    }
@Autowired
private BookController bookController;
    @Test
    public void test2(){
        bookController.buyBook(1, 1);
    }
    @Test
    public void test3(){
        bookController.checkout(new Integer[]{1,2}, 1);
    }
}
