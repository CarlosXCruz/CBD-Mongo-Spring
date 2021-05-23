package com.javarevolutions.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarevolutions.mongodb.entity.Entidad;
import com.javarevolutions.mongodb.entity.Monitores;
import com.javarevolutions.mongodb.repository.JRRepository;
import com.javarevolutions.mongodb.repository.MonitoresRepository;

@Service
public class MonitoresService {
	@Autowired
	MonitoresRepository monitoresRepository;
	
	public Monitores guardar(Monitores entity) {
		return monitoresRepository.save(entity);
	}
	
	public boolean borrar(Monitores entity) {
		try {
			monitoresRepository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Monitores actualizar(Monitores entity) {
		return monitoresRepository.save(entity);
	}
	

	
	public List<Monitores> consultarTodos() {
		return monitoresRepository.findAll();
	}
}
