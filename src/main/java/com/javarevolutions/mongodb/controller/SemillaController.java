package com.javarevolutions.mongodb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javarevolutions.mongodb.entity.Arbol;
import com.javarevolutions.mongodb.entity.Semilla;
import com.javarevolutions.mongodb.service.SemillaService;

@Controller
@RequestMapping(path = "/semillas")
public class SemillaController {
	
	@Autowired
	SemillaService serviceSemilla;
	
	@GetMapping(value = "/lista")
	public String semillas(Model model, HttpServletRequest request) {

		Iterable<Semilla> semillas = serviceSemilla.consultarTodos();
		for (Semilla s : semillas) {
			String url = s.getUrl();
			s.setUrl(url + "&tag=cbd0052-21");
			String precio = s.getPrecio();
			s.setPrecio(precio + "€");
		}
		model.addAttribute("semillas", semillas);
		return "semillas.html";
    }
	
	@RequestMapping(value = "/error")
	public String error() {
		return "error.html";
	}
}
