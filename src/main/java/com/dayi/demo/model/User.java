package com.dayi.demo.model;

import java.io.Serializable;

/**
 * @author yangshaoqiang <yangshq@pvc123.com>
 * @create 2021-04-04 17:27
 */
public class User implements Serializable {
    /** 主键标识 */
    private Integer id;
    /** 用户名 */
    private String userName;
    /** 邮箱 */
    private String email;
    /** 年龄 */
    private Integer age;
    /** 电话号码 */
    private String phone;

    public User() {
    }

    public User(Integer id, String userName, String email, Integer age, String phone) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
