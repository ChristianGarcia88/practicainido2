package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controller {



	@GetMapping("/inicio")
	public String mostrarRegistro( Model m) {
	

		
			m.addAttribute("persona", "maldicion");
		
		return "registro";

	}

}
