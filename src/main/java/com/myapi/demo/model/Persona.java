package com.myapi.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "persona")
public class Persona {

    private static final long serialVersionUID = 2330289880871451994L;

    @Id
    private String email;
    private String nombre;
    private String apellido;
    private Ubicacion ubicacion;
    private List<String> herramientas;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<String> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(List<String> herramientas) {
        this.herramientas = herramientas;
    }
}
