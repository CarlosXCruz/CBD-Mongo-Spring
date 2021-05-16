package com.javarevolutions.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javarevolutions.mongodb.entity.Entidad;

@Repository
public interface JRRepository extends MongoRepository<Entidad, String> {
	
}
