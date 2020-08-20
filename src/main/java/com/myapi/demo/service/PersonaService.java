package com.myapi.demo.service;

import com.myapi.demo.model.Persona;
import com.myapi.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona findById(String email) {
        Persona p = new Persona();
        p.setEmail(email);
        Example<Persona> pe = Example.of(p);
        return  personaRepository.findOne(pe).orElse(null);
    }

    public List<Persona> findAll() {
        return  personaRepository.findAll();
    }

    public Persona update(Persona persona) {
        return  personaRepository.save(persona);
    }

    public boolean delete(String email) {
        Persona p = findById(email);
        try {
            personaRepository.delete(p);
            return true;
        } catch(Exception ex) {
            return false;
        }
    }

}
