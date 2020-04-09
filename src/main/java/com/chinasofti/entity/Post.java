package com.chinasofti.entity;

import java.util.Date;

public class Post {
    private Integer post_id;
    private String post_name;
    private Integer Spost_id;
    private Date post_addDate;
    private Date post_mDate;

    public Post() {
    }

    public Post(String post_name, Integer spost_id, Date post_addDate, Date post_mDate) {
        this.post_name = post_name;
        this.Spost_id = spost_id;
        this.post_addDate = post_addDate;
        this.post_mDate = post_mDate;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public Integer getSpost_id() {
        return Spost_id;
    }

    public void setSpost_id(Integer spost_id) {
        Spost_id = spost_id;
    }

    public Date getPost_addDate() {
        return post_addDate;
    }

    public void setPost_addDate(Date post_addDate) {
        this.post_addDate = post_addDate;
    }

    public Date getPost_mDate() {
        return post_mDate;
    }

    public void setPost_mDate(Date post_mDate) {
        this.post_mDate = post_mDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", post_name='" + post_name + '\'' +
                ", Spost_id=" + Spost_id +
                ", post_addDate=" + post_addDate +
                ", post_mDate=" + post_mDate +
                '}';
    }
}
