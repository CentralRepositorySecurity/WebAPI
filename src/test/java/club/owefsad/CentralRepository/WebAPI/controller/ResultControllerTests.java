package club.owefsad.CentralRepository.WebAPI.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResultControllerTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ResultController()).build();
    }

    @Test
    public void getList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/result/list").accept(MediaType.APPLICATION_JSON)).andDo(
                MockMvcResultHandlers.print()).andReturn();
    }
}
