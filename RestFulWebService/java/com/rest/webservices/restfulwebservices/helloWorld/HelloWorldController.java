package com.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return " Hello-World !!! ";
	}
	
	@GetMapping(path="/hello-world-bean")
	@ResponseBody
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean(" Hello-World !!! ");
	}
}


//If we are using @Controller , then we need to call explicitly @ResponseBidy 
//in order to do auto conversion , else will get error

//In case of @RestController , no need to explicitly write @ResponseBody
//@RestControler --> @Controller + @ResponseBody