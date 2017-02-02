package com.homedepot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PersonalController {

	    @RequestMapping("/test")
	    public String index() {
	        return "Hello World!";
	    }

}
