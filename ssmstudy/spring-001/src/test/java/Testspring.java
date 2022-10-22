import com.spring.bean.Clazz;
import com.spring.bean.HelloWorld;
import com.spring.bean.Student;
import com.spring.controller.UserController;
import com.spring.dao.UserDao;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspring {
    @Test
    public void testHelloWorld(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = ioc.getBean("studentone", Student.class);
//        System.out.println(student);
        Clazz clazz = ioc.getBean("clazzone", Clazz.class);
        System.out.println(clazz);
    }
    @Test
    public void text1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
//        Student student = ioc.getBean("studentone", Student.class);
//        System.out.println(student);
        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean(UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);
        userController.saveUser();
    }
}
