package com.avntechgroup.meco.xandar.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DemoApplicationTests {

	@Value(value="${local.server.port}")
	private int port;

	@Test
	@DisplayName("Test the hello endpoint")
	void success() {
		TestRestTemplate restTemplate = new TestRestTemplate();

		assertThat(restTemplate.getForObject("http://localhost:" + port + "/?name=MECO Participants",
				String.class)).contains("Hello MECO Participants");
	}

}
