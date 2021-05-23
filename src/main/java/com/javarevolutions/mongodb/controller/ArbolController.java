package com.javarevolutions.mongodb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javarevolutions.mongodb.entity.Arbol;
import com.javarevolutions.mongodb.service.ArbolService;

@Controller
@RequestMapping(path = "/arboles")
public class ArbolController {
	
	@Autowired
	ArbolService serviceArbol;
	
	@GetMapping(value = "/lista")
	public String arboles(Model model, HttpServletRequest request) {

		Iterable<Arbol> arboles = serviceArbol.consultarTodos();
		for (Arbol a : arboles) {
			String url = a.getUrl();
			a.setUrl(url + "&tag=cbd0052-21");
			String precio = a.getPrecio();
			a.setPrecio(precio + "€");
		}
		model.addAttribute("arboles", arboles);

		return "arboles.html";
    }
	
	@RequestMapping(value = "/error")
	public String error() {
		return "error.html";
	}
}
