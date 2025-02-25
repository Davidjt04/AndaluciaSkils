package com.david.backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;


private String descripcion;
private int peso;
private String gradosConsecucion;

@ManyToOne
@JoinColumn(name = "Prueba_idPrueba", nullable = false)
private Prueba prueba;


// Getters and Setters

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public int getPeso() {
    return peso;
}

public void setPeso(int peso) {
    this.peso = peso;
}

public String getGradosConsecucion() {
    return gradosConsecucion;
}

public void setGradosConsecucion(String gradosConsecucion) {
    this.gradosConsecucion = gradosConsecucion;
}

public Prueba getPrueba() {
    return prueba;
}

public void setPrueba(Prueba prueba) {
    this.prueba = prueba;
}
}
