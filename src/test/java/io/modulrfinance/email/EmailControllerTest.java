package io.modulrfinance.email;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest
class EmailControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloFromModulr() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello From Modulr")));
    }
}