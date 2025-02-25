package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entidades.Item;

public interface RepoItem extends JpaRepository<Item,Integer>{
    
}
