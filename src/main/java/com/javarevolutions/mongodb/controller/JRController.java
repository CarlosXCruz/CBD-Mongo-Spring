package com.javarevolutions.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarevolutions.mongodb.entity.Entidad;
import com.javarevolutions.mongodb.service.JRService;

@Controller
@RequestMapping(path = "/inicio")
public class JRController {
	@Autowired
	JRService serviceJR;
	
	@GetMapping(value = "/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping(value = "/error")
	public String error() {
		return "error.html";
	}
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Entidad guardar(@RequestBody Entidad entity) {
		return serviceJR.guardar(entity);
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody Entidad entity) {
		return serviceJR.borrar(entity);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Entidad actualizar(@RequestBody Entidad entity) {
		return serviceJR.actualizar(entity);
	}
	
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Entidad consultarPorId(@RequestBody Entidad entity) {
		return serviceJR.consultarPorId(entity);
	}
	
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Entidad> consultarTodos() {
		return serviceJR.consultarTodos();
	}
}
