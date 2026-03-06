package com.ad.jenkins_demo_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class JenkinsDemoAppApplicationTests {

	@Autowired
	private JenkinsDemoAppApplication application;

	@Test
	void contextLoads() throws Exception {
		String name = "Basanta kumar hota";
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(application).build();

		mockMvc.perform(get("/jenkinstest/{name}", name))
					.andExpect(status().isOk())
					.andExpect(content().string(
							"Hello" + name + "Congrats you have successfully completed jenkins demo"
					));
	}

}
