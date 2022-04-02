package net.yp.java.web.foundational.dao;

import net.yp.java.web.foundational.entity.User;

/**
 * 用户数据访问（对数据的增删改查）接口
 *第一步：连接数据库
 * 第三步：数据库添加，增加一个接口
 *
 * @author yp
 * @version 2022/4/223:46
 * @since JDK1.8-201
 */
public interface UserDao {
    /**
     * 数据库连接的Url、name、password
     */
    //数据库连接地址：jdbc:mysql://主机：端口/数据库名称
    String url="jdbc:mysql://127.0.0.1:3306/psychological";
    String username="root";
    String userpassword="1234";

    /**
     * 新增用户
     * @param user
     * @return
     */
    int insert(User user);

}
