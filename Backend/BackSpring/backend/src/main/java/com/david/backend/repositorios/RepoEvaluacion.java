package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entidades.Evaluacion;

public interface RepoEvaluacion extends JpaRepository <Evaluacion,Integer>{
    
}
