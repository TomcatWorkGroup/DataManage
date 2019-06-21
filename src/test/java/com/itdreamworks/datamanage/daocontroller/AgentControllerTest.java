package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.JsonUtil;
import com.itdreamworks.datamanage.entity.db.Agent;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import com.alibaba.fastjson.JSON;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment =SpringBootTest.WebEnvironment.MOCK,classes = TestDataManageApplication.class)
//@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest//(webEnvironment =SpringBootTest.WebEnvironment.MOCK,classes = TestDataManageApplication.class)
@AutoConfigureMockMvc
public class AgentControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("测试获取所有代理的接口")
    public void getAll() throws Exception {
        MockHttpServletRequestBuilder builder = get("/agent/list")
                .contentType(MediaType.APPLICATION_JSON);
        ResultActions action = mockMvc.perform(builder);
        MvcResult result = action.andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void create() throws Exception{
        Agent agent = new Agent();
        agent.setAgentName("BBB");
        agent.setStatus(1);

        String str = JSON.toJSONString(agent);
        str = JsonUtil.getUrlParamString(str);
        MvcResult result = mockMvc.perform(post("/agent/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
        .content(str)).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void modify() throws Exception {
        Agent agent = new Agent();
        agent.setId(1);
        agent.setAgentName("BBB");
        agent.setStatus(1);

        String str = JSON.toJSONString(agent);
        str = JsonUtil.getUrlParamString(str);
        MvcResult result = mockMvc.perform(post("/agent/modify")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .content(str)).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}