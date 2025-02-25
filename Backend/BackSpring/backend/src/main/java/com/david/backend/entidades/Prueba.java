package com.david.backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Prueba {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String enunciado;

@ManyToOne
@JoinColumn(name = "Especialidad_idEspecialidad", nullable = false)
private Especialidad especialidad;


private int puntuacionMaxima;

 // Getters and Setters

 public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getEnunciado() {
    return enunciado;
}

public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}

public int getPuntuacionMaxima() {
    return puntuacionMaxima;
}

public void setPuntuacionMaxima(int puntuacionMaxima) {
    this.puntuacionMaxima = puntuacionMaxima;
}
}
