package com.chinasofti.mapper;


import com.chinasofti.entity.Post;

import com.chinasofti.util.PageBean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostMapper {
    //查询所有岗位名称
    List<Post> queryAllPost();

    //查询自己所在岗位名称
    Post queryMyPost(Integer id);

    //根据编号和名字查找
    Post queryMyPostByName(Integer id,String name);

    //查询上级岗位编号
    int FindSPostid(Post post);

    //新增岗位
    void savePost(Post post);

    //修改岗位
    void ModifyPostName(Post post);


    //删除这个岗位
    void deletPostById(Integer id);

    //模糊查询
    List<Post> searchPost(String postid, String name);



}
