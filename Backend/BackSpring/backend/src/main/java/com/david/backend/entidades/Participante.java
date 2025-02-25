package com.david.backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Participante {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String nombre;
private String apellidos;
private String centro;

@ManyToOne
@JoinColumn(name = "Especialidad_idEspecialidad", nullable = false)
private Especialidad especialidad;

// Getters and Setters
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public String getCentro() {
    return centro;
}

public void setCentro(String centro) {
    this.centro = centro;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}






}
