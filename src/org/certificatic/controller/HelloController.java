package org.certificatic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String hello(Model model) {
		System.out.println("::: Entro a Hello Controller :::");
		String saludo = "Eduardo Castillo Mendoza";
		model.addAttribute("saludo", saludo);
		return "index";
	}

}
