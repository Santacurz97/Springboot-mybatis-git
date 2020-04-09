package com.chinasofti.service;

import com.chinasofti.entity.Post;
import com.chinasofti.entity.Staff;

import java.util.List;

public interface PostService {
    //查询所有岗位名称
    List<Post> queryAllPost();

    //查询自己所在岗位名称
    Post queryMyPost(Integer id);

    //查询上级岗位编号
    int FindSPostid(Post post);

    //新增岗位
    void savePost(Post post);

    //修改岗位名称
    void ModifyPostName(Post post);

    //上级岗位调动
    void ModifyPost(Post post);

    //删除岗位
    void deletPostById(Integer id);

}
