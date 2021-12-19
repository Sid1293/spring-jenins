package com.baueldung;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.sidrest.SpringRestWithH2Application;

@SpringBootTest
class SpringRestWithH2ApplicationTests {
	
	
	public static Logger logger=LoggerFactory.getLogger(SpringRestWithH2ApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case sc excutng...........");
		assertEquals(true, true);
	}

}
