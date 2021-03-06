package com.myapi.demo.repository;

import com.myapi.demo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, Integer> {

}
