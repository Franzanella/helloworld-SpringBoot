package br.com.franciele.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class HelloWorld {
	@GetMapping
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

}
