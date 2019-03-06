package io.vignesh.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Create rest service
@RestController
public class HelloController {
/*
 * @RequestMapping is default to Get method. 
 * For other methods, specify in annotation	
 */
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
