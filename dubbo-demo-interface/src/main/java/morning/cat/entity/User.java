package morning.cat.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/4 10:53 AM
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1569559877797345549L;

    private int id;
    private String name;
    private String address;


}
