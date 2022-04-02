package net.yp.java.web.foundational.util;

/**
 * DAO层使用Dbutils实现，后期换成Mybatis
 *
 * @author yp
 * @version 2022/4/30:13
 * @since JDK1.8-201
 */

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Druid连接池工具类
 */
public class DruidDataSourceUtil {
    /**
     * 连接池
     */
    private static DataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
            //解析jdbc.properties
            //将解析的数据赋值给工具类的静态成员变量
            properties.load(DruidDataSourceUtil.class.getClassLoader().getResourceAsStream("druid.properties"));
            //创建DruidDataSource
            dataSource =  DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 获取数据库的连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    /**
     * 数据库操作释放资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static  void release(ResultSet resultSet, Statement statement, Connection connection){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //测试代码
    public static void main(String[] args){
        Connection connection =getConnection();
        System.out.println(connection);
    }
}
