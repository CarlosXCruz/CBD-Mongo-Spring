package com.javarevolutions.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javarevolutions.mongodb.entity.Entidad;
import com.javarevolutions.mongodb.entity.Monitores;

@Repository
public interface MonitoresRepository extends MongoRepository<Monitores, String> {
	
}
