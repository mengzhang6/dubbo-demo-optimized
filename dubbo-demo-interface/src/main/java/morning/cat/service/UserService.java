package morning.cat.service;

import morning.cat.entity.User;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 10:56 AM
 */
public interface UserService {

    User getById(Long id);
}
