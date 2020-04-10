package com.chinasofti.serviceImpl;

import com.chinasofti.entity.Post;
import com.chinasofti.mapper.PostMapper;
import com.chinasofti.service.PostService;
import com.chinasofti.util.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public List<Post> queryAllPost() {
        return postMapper.queryAllPost();
    }

    @Override
    public PageBean<Post> selectAllPost(int page, int limit) {
        PageHelper.offsetPage((page-1)*limit, limit);
        List<Post> postList = postMapper.queryAllPost();
        PageInfo<Post> pageInfo = new PageInfo<>(postList);
        PageBean<Post> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(postList);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
    }

    @Override
    public Post queryMyPost(Integer id) {
        return postMapper.queryMyPost(id);
    }

    @Override
    public Post queryMyPostByName(Integer id, String name) {
        return postMapper.queryMyPostByName(id, name);
    }

    @Override
    public int  FindSPostid(Post post) {
        return postMapper.FindSPostid(post);

    }

    @Override
    public void savePost(Post post) {
        postMapper.savePost(post);
    }

    @Override
    public void ModifyPostName(Post post) {
        postMapper.ModifyPostName(post);
    }

    @Override
    public void deletPostById(Integer id) {
        postMapper.deletPostById(id);
    }

    @Override
    public PageBean<Post> searchPost(int postid, String name) {
        List<Post> post = postMapper.searchPost(postid,name);
        System.out.println(post);
        PageInfo<Post> pageInfo = new PageInfo<>();
        PageBean<Post> pageBean = new PageBean<>();
        pageBean.setCount((int) pageInfo.getTotal());
        pageBean.setData(post);
        pageBean.setMsg("");
        pageBean.setCode(0);
        return pageBean;
    }
}
