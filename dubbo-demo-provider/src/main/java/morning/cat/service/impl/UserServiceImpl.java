package morning.cat.service.impl;

import morning.cat.dao.UserDao;
import morning.cat.entity.User;
import morning.cat.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 11:11 AM
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getById(Long id) {
        return userDao.getUserById(id);
    }
}
