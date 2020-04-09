package com.chinasofti.serviceImpl;

import com.chinasofti.entity.Post;
import com.chinasofti.mapper.PostMapper;
import com.chinasofti.service.PostService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    private PostMapper postMapper;

    @Override
    public List<Post> queryAllPost() {
        return postMapper.queryAllPost();
    }

    @Override
    public Post queryMyPost(Integer id) {
        return postMapper.queryMyPost(id);
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
    public void ModifyPost(Post post) {
        postMapper.ModifyPost(post);
    }

    @Override
    public void deletPostById(Integer id) {
        postMapper.deletPostById(id);
    }
}
