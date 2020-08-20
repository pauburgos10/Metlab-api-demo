package com.myapi.demo.controller;

import com.myapi.demo.model.Persona;
import com.myapi.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/")
    public String getDemo(){
        return "Hello MeT!!!";
    }

    @RequestMapping(value = "/personas", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Persona guardar(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @RequestMapping(value = "/personas", method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Persona> consultarTodos() {
        return personaService.findAll();
    }

    @RequestMapping(value = "/personas/{email}", method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Persona consultarPorEmail(@PathVariable("email") String email) {
        return personaService.findById(email);
    }

    @RequestMapping(value = "/personas", method = RequestMethod.PUT,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Persona modificar(@RequestBody Persona persona) {
        return personaService.update(persona);
    }

    @RequestMapping(value = "/personas/{email}", method = RequestMethod.DELETE,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody boolean borrar(@PathVariable("email") String email) {
        return personaService.delete(email);
    }


}
