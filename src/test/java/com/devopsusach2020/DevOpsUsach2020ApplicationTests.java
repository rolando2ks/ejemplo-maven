package com.devopsusach2020;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void verUrl() {
		ResponseEntity<String> postResponse = restTemplate.getForEntity("https://api.covid19api.com/live/country/", String.class);
		Assert.assertNotNull(postResponse.getBody());
	}

}
