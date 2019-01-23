package com.bakke.rest.webservices.restfullwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@RequestMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean () {
//		throw new RuntimeException("An Error Has Occured!");
		return new HelloWorldBean("hello world from spring boot bean");
	}
	
	@RequestMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable (@PathVariable String name) {
		return new HelloWorldBean(String.format("helo, %s ", name));
	}
}
