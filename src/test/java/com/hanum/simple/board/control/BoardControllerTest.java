package com.hanum.simple.board.control;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class BoardControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getPost() throws Exception {
        System.out.println("===========================================================");
        mockMvc.perform(MockMvcRequestBuilders.get("/posts")
                                                .param("page","0")
                                                .param("size","10")
                                                .param("sort","title"))
                                        .andDo(MockMvcResultHandlers.print());
        System.out.println("===========================================================");


    }
}