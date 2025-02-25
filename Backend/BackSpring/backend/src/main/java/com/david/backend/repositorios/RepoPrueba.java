package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entidades.Prueba;

public interface RepoPrueba extends JpaRepository<Prueba,Integer>{
    
}
