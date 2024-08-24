package com.tutorial.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void TestAppConstructor() {
		DemoApplication app1 = new DemoApplication();
		DemoApplication app2 = new DemoApplication();
		assertEquals(app1.getMessage(), app2.getMessage());
	}

	@Test
	void testAppMessage() {
		DemoApplication demoApplication = new DemoApplication();
		assertEquals("Hello World!", demoApplication.getMessage());
	}

}
