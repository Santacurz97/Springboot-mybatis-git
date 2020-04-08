package com.chinasofti.entity;

public class TUser {
    private Integer id;

    private String name;

    private String userName;

    private String pwd;

    public TUser(Integer id, String name, String userName, String pwd) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.pwd = pwd;
    }

    public TUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
