package com.chinasofti.vo;

import com.chinasofti.entity.Department;
import com.chinasofti.entity.Post;

import java.util.List;

public class StaffVo {
    private List<Department> departmentList;
    private List<Post> postList;

    @Override
    public String toString() {
        return "StaffVo{" +
                "departmentList=" + departmentList +
                ", postList=" + postList +
                '}';
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
