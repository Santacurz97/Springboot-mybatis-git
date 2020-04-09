package com.chinasofti.util;

import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 4522808483658812325L;
    private int count;      //总条数
    private List<T> data;   //当前页数据
    private int code;
    private String msg;

    @Override
    public String toString() {
        return "PageBean{" +
                "count=" + count +
                ", data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
