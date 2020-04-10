package com.chinasofti.test;


import com.chinasofti.MybatisApplication;
import com.chinasofti.entity.Post;
import com.chinasofti.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)
public class PostTest {
    @Autowired
    private PostService postService;

    @Test
    public void contextLoads() {

//        Post post = new Post("bcde",3,null,null);
//        System.out.println(post.toString());
//        postService.savePost(post);
//        int i = postService.deletPostById(2);
//        System.out.println(i);
//        List<Post> list = postService.queryAllPost();
//        System.out.println(list.toString());
//         Post post1 = postService.queryMyPost(1);
//         int i =  postService.FindSPostid(post1);
//         System.out.println(i);
//        Post post = postService.queryMyPostByName(1,"bcd");
//        System.out.println(post.toString());
//        Post post = postService.queryMyPost(1);
//        post.setPost_name("bcd");
//        post.setSpost_id(1);
//        postService.ModifyPostName(post);


    }

}
