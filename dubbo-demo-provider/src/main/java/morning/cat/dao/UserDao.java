package morning.cat.dao;

import morning.cat.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("userDao")
public class UserDao {

    @Resource
    private NamedParameterJdbcTemplate npJdbcTemplate;


    private static final String FIND_SQL = "SELECT `id`,`name`,`address` FROM user";

    public User getUserById(Long id) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        String sql = FIND_SQL + " WHERE id =:id";
        paramMap.put("id", id);

        List<User> list = npJdbcTemplate.query(sql, paramMap,
                new BeanPropertyRowMapper<User>(User.class));

        if (!CollectionUtils.isEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

}
