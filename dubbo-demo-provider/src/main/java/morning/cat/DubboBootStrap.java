package morning.cat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 11:02 AM
 */
public class DubboBootStrap {

    /**
     * 启动服务
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // 启动
        context.start();

        try {
            // 阻止进程停止
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
            context.close();
        }
    }

}
