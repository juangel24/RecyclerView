package com.example.recyclerview.Models;

public class Persona {
    private Integer id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;

    public Persona(Integer id, String nombre, String apellido, Integer edad) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
