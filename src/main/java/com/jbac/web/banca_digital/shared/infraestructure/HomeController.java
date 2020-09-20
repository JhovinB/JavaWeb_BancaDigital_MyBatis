package com.jbac.web.banca_digital.shared.infraestructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/home")
public class HomeController {
	
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Hola";
	}
	
	
	
	
	
}
