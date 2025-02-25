package com.david.backend.entidades;

import jakarta.persistence.Entity;

@Entity
public class Evaluacion_Item {

//defino los atributos que tiene la tabla de la relación entre ambas clases
private int valoracion;
private String explicacion;

// Getters and Setters

public int getValoracion() {
    return valoracion;
}

public void setValoracion(int valoracion) {
    this.valoracion = valoracion;
}

public String getExplicacion() {
    return explicacion;
}

public void setExplicacion(String explicacion) {
    this.explicacion = explicacion;
}
    
}
