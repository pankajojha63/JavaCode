package com.rest.webservices.restfulwebservices.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPath(@PathVariable String name) {
		return new HelloWorldBean("Welcome :: " + name);
	}

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", 
		required = false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, "Default Message ", locale);
	}

	/*
	 * @GetMapping(path = "/hello-world-internationalized") public String
	 * helloWorldInternationalized() { return
	 * messageSource.getMessage("good.morning.message", null, "Default Message "
	 * , LocaleContextHolder.getLocale()); }
	 */
}
