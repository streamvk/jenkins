package com.nineleaps.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {
	@GetMapping(value="/hello")
	public String sayHello() {
		return"Hello Jenkins";
	}

}
