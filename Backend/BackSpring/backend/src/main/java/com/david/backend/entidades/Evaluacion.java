package com.david.backend.entidades;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Evaluacion {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private double notaFinal;

@ManyToOne
@JoinColumn(name = "participante_idParticipante", nullable = false)
private Participante participante;

@ManyToOne
@JoinColumn(name = "Prueba_idPrueba", nullable = false)
private Prueba prueba;

@ManyToOne
@JoinColumn(name = "User_idUser", nullable = false)
private Usuario usuario;

private double nota_final;

// Getters and Setters

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public double getNotaFinal() {
    return notaFinal;
}

public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
}

public Participante getParticipante() {
    return participante;
}

public void setParticipante(Participante participante) {
    this.participante = participante;
}

public Prueba getPrueba() {
    return prueba;
}

public void setPrueba(Prueba prueba) {
    this.prueba = prueba;
}

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

public double getNota_final() {
    return nota_final;
}

public void setNota_final(double nota_final) {
    this.nota_final = nota_final;
}

}
