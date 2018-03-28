package com.mySSM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "USER")
public class User  {
    /** 版本号 */
    private static final long serialVersionUID = 6133669749921173865L;

    /** 用户ID */
    @Id
    @Column(name = "ID", unique = true, nullable = false, length = 10)
    private Integer id;

    /** 用户邮箱 */
    @Column(name = "EMAIL", unique = true, nullable = false, length = 255)
    private String email;

    /** 用户密码 */
    @Column(name = "PASSWORD", nullable = false, length = 255)
    private String password;

    /** 用户昵称 */
    @Column(name = "USERNAME", nullable = false, length = 255)
    private String username;

    /** 用户身份 */
    @Column(name = "ROLE", nullable = false, length = 255)
    private String role;

    /** 用户状态 */
    @Column(name = "STATUS", nullable = false, length = 10)
    private Integer status;

    /** 注册时间 */
    @Column(name = "regTime", nullable = false, length = 26)
    private Date regTime;

    /** 注册IP */
    @Column(name = "regIp", nullable = false, length = 255)
    private String regIp;

    /**
     * 获取用户ID
     *
     * @return 用户ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置用户ID
     *
     * @param id
     *          用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户邮箱
     *
     * @return 用户邮箱
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email
     *          用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户密码
     *
     * @return 用户密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置用户密码
     *
     * @param password
     *          用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户昵称
     *
     * @return 用户昵称
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置用户昵称
     *
     * @param username
     *          用户昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户身份
     *
     * @return 用户身份
     */
    public String getRole() {
        return this.role;
    }

    /**
     * 设置用户身份
     *
     * @param role
     *          用户身份
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取用户状态
     *
     * @return 用户状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置用户状态
     *
     * @param status
     *          用户状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取注册时间
     *
     * @return 注册时间
     */
    public Date getRegTime() {
        return this.regTime;
    }

    /**
     * 设置注册时间
     *
     * @param regTime
     *          注册时间
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * 获取注册IP
     *
     * @return 注册IP
     */
    public String getRegIp() {
        return this.regIp;
    }

    /**
     * 设置注册IP
     *
     * @param regIp
     *          注册IP
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }
}
