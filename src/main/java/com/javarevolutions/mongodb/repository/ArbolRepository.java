package com.javarevolutions.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javarevolutions.mongodb.entity.Arbol;

@Repository
public interface ArbolRepository extends MongoRepository<Arbol, String> {
	
}
