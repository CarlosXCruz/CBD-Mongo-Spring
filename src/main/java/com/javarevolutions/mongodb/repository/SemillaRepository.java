package com.javarevolutions.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javarevolutions.mongodb.entity.Semilla;

@Repository
public interface SemillaRepository extends MongoRepository<Semilla, String> {
	
}
