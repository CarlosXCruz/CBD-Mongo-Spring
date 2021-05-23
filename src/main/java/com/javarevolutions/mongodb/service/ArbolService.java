package com.javarevolutions.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarevolutions.mongodb.entity.Arbol;
import com.javarevolutions.mongodb.repository.ArbolRepository;

@Service
public class ArbolService {
	
	@Autowired
	ArbolRepository ArbolRepository;
	
	public Arbol guardar(Arbol entity) {
		return ArbolRepository.save(entity);
	}
	
	public boolean borrar(Arbol entity) {
		try {
			ArbolRepository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public Arbol actualizar(Arbol entity) {
		return ArbolRepository.save(entity);
	}
	
	public List<Arbol> consultarTodos() {
		return ArbolRepository.findAll();
	}
}
