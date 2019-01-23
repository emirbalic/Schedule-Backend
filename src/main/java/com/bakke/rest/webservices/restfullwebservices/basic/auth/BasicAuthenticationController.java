package com.bakke.rest.webservices.restfullwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@RequestMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean () {
//		throw new RuntimeException("An Error Has Occured!");
		return new AuthenticationBean("You are authenticated");
	}
	
	
}
