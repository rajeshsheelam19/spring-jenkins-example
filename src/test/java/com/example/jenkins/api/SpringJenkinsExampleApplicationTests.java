package com.example.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsExampleApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsExampleApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing after maven build");
		logger.info("Jenkins build");
		
	}

}
