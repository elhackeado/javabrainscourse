package javabrainscourse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String sayHi() {
		return "Welcome to JavaBrains Course API  --- Update 3";
	}

}
