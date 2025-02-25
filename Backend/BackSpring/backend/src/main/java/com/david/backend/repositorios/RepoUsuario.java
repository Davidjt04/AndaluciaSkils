package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entidades.Usuario;

public interface RepoUsuario extends JpaRepository<Usuario,Integer>{
    
}
