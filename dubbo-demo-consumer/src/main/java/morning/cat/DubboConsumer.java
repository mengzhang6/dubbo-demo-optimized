package morning.cat;

import morning.cat.entity.User;
import morning.cat.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 2:16 PM
 */
public class DubboConsumer {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        User user = userService.getById(1L);
        System.out.println(user);

    }
}
