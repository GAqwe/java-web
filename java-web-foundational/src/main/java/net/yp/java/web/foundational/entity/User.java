package net.yp.java.web.foundational.entity;

import java.io.Serializable;

/**
 * 用户实体表
 *
 * 第二步：数据库实体化
 * 1.先建立方法set\get方法
 * 2.生成toString打印对象内容
 *3.给它一个构造方法点击Generate中的Construct全部选择反选，是空参的，再次选择点击OK，是满参的
 * @author yp
 * @version 2022/4/223:50
 * @since JDK1.8-201
 */
public class User implements Serializable {

    /**
     * id
     */
    private Integer adminId;
    /**
     * 管理员用户名
     */
    private String adminName;
    /**
     * 管理员密码
     */
    private  String adminPw;


    //建立构造方法反选空参
    public User() {
    }
    //建立构造方法满参
    public User(Integer adminId, String adminName, String adminPw) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPw = adminPw;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPw() {
        return adminPw;
    }

    public void setAdminPw(String adminPw) {
        this.adminPw = adminPw;
    }

    @Override
    public String toString() {
        return "User{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPw='" + adminPw + '\'' +
                '}';
    }
}
