package com.yash.demo.binding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@GetMapping("/appStatus")
	public String getApplicationStatus() {
		return "Application is up and running";
	}

}
