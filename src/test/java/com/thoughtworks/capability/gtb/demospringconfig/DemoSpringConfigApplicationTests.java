package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest(properties = { "levelNumber=2" })
@AutoConfigureMockMvc
class DemoSpringConfigApplicationTests {

	@Resource
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldGetLevel() throws Exception {
		mockMvc.perform(get("/level"))
				.andExpect(jsonPath("$", is("advanced")));
	}
}
