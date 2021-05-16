package com.javarevolutions.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarevolutions.mongodb.entity.Entidad;
import com.javarevolutions.mongodb.repository.JRRepository;

@Service
public class JRService {
	@Autowired
	JRRepository repository;
	
	public Entidad guardar(Entidad entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(Entidad entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Entidad actualizar(Entidad entity) {
		return repository.save(entity);
	}
	
	public Entidad consultarPorId(Entidad entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<Entidad>consultarTodos() {
		return repository.findAll();
	}
}
