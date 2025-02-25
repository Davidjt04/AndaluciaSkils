package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entidades.Participante;

public interface RepoParticipante extends JpaRepository<Participante,Integer>{
    
}
