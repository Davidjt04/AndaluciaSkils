package com.david.backend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Usuario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String rol;
private String usuario;
private String password;
@ManyToOne
@JoinColumn(name = "Especialidad_idEspecialidad", nullable = false)
private Especialidad especialidad;

private String nombre;
private String apellidos;
private String dni;


// Getters and Setters

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getRol() {
    return rol;
}

public void setRol(String rol) {
    this.rol = rol;
}

public String getUsuario() {
    return usuario;
}

public void setUsuario(String usuario) {
    this.usuario = usuario;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public Especialidad getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
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

public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}
}
