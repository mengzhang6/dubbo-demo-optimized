package morning.cat.service.impl;

import morning.cat.service.HelloService;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 11:12 AM
 */
public class HelloServiceImpl implements HelloService {


    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public String getWorld() {
        return "你好 世界";
    }
}
