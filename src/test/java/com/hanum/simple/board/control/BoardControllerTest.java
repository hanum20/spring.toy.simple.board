package com.hanum.simple.board.control;

import com.hanum.simple.board.domain.Post;
import com.hanum.simple.board.repository.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class BoardControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    PostRepository postRepository;

    @Test
    public void getPost() throws Exception {
        System.out.println("===========================================================");
        mockMvc.perform(MockMvcRequestBuilders.get("/posts")
                                                .param("page","0")
                                                .param("size","10")
                                                .param("sort","title"))
                                        .andDo(print());
        System.out.println("===========================================================");


    }

    @Test
    public void testGetPost() {
    }

    @Test
    public void getPostById() throws Exception {
        System.out.println("===========================================================");
        Post post = new Post();
        post.setTitle("hello");

        postRepository.save(post);

        mockMvc.perform(MockMvcRequestBuilders.get("/posts/1"))
                .andDo(print());

        System.out.println("===========================================================");
    }
}