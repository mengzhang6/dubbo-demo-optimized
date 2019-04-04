package morning.cat;

import morning.cat.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 2:24 PM
 */
public class HelloWorld {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service = context.getBean(HelloService.class);

        service.sayHello("cat");
        System.out.println(service.getWorld());


    }
}
