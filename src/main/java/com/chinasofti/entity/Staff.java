package com.chinasofti.entity;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private Date staffBirth;

    //身份证编号
    private String staffNum;
    //部门编号
    private Integer departmentId;
    //岗位编号
    private Integer postId;
    //是否试用期
    private Integer probation;
    //是否离职
    private Integer quit;
    //添加时间
    private Date staffAdddate;
    //修改时间
    private Date staffMdate;

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", staffSex='" + staffSex + '\'' +
                ", staffBirth=" + staffBirth +
                ", staffNum='" + staffNum + '\'' +
                ", departmentId=" + departmentId +
                ", postId=" + postId +
                ", probation=" + probation +
                ", quit=" + quit +
                ", staffAdddate=" + staffAdddate +
                ", staffMdate=" + staffMdate +
                '}';
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Date getStaffBirth() {
        return staffBirth;
    }

    public void setStaffBirth(Date staffBirth) {
        this.staffBirth = staffBirth;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum == null ? null : staffNum.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getProbation() {
        return probation;
    }

    public void setProbation(Integer probation) {
        this.probation = probation;
    }

    public Integer getQuit() {
        return quit;
    }

    public void setQuit(Integer quit) {
        this.quit = quit;
    }

    public Date getStaffAdddate() {
        return staffAdddate;
    }

    public void setStaffAdddate(Date staffAdddate) {
        this.staffAdddate = staffAdddate;
    }

    public Date getStaffMdate() {
        return staffMdate;
    }

    public void setStaffMdate(Date staffMdate) {
        this.staffMdate = staffMdate;
    }
}