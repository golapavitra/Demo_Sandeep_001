package com.san.devops.Sandev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@SpringBootApplication
public class SandevApplication {

	 @GetMapping("/getindex")
	    public String index() {
	        return "index"; // This will return "index.html" from resources/static or resources/public
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(SandevApplication.class, args);
	}

}
