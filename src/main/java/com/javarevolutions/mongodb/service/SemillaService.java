package com.javarevolutions.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarevolutions.mongodb.entity.Semilla;
import com.javarevolutions.mongodb.repository.SemillaRepository;

@Service
public class SemillaService {
	
	@Autowired
	SemillaRepository semillaRepository;
	
	public Semilla guardar(Semilla entity) {
		return semillaRepository.save(entity);
	}
	
	public boolean borrar(Semilla entity) {
		try {
			semillaRepository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Semilla actualizar(Semilla entity) {
		return semillaRepository.save(entity);
	}
	
	public List<Semilla> consultarTodos() {
		return semillaRepository.findAll();
	}
}
