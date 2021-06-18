package com.example.travisdemo;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TravisdemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void failTest() {
		fail();
	}

}
