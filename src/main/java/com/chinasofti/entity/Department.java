package com.chinasofti.entity;

import java.util.Date;

public class Department {
    private Integer departmentId;

    private String departmentName;

    private Integer sdepartmentId;

    private String sdepartmentName;

    private Date departmentAdddate;

    private Date departmentMdate;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getSdepartmentName() {
        return sdepartmentName;
    }

    public void setSdepartmentName(String sdepartmentName) {
        this.sdepartmentName = sdepartmentName;
    }

    public Integer getSdepartmentId() {
        return sdepartmentId;
    }

    public void setSdepartmentId(Integer sdepartmentId) {
        this.sdepartmentId = sdepartmentId;
    }

    public Date getDepartmentAdddate() {
        return departmentAdddate;
    }

    public void setDepartmentAdddate(Date departmentAdddate) {
        this.departmentAdddate = departmentAdddate;
    }

    public Date getDepartmentMdate() {
        return departmentMdate;
    }

    public void setDepartmentMdate(Date departmentMdate) {
        this.departmentMdate = departmentMdate;
    }
}