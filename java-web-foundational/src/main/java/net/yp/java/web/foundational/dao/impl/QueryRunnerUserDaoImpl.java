package net.yp.java.web.foundational.dao.impl;

import net.yp.java.web.foundational.dao.UserDao;
import net.yp.java.web.foundational.entity.User;
import net.yp.java.web.foundational.util.DruidDataSourceUtil;

/**
 * 基于DbUtils提供的QueryRunner实现用户增删改查操作
 *
 * @author yp
 * @version 2022/4/30:12
 * @since JDK1.8-201
 */
public class QueryRunnerUserDaoImpl implements UserDao {

    /**
     * 创建QueryRunner对象
     */
    private final QueryRunner queryRunner = new QueryRunner(DruidDataSourceUtil.getDataSource());
    @Override
    public int insert(User user) {
        return 0;
    }
}
