package com.david.interfaces;

import java.util.List;
import java.util.Optional;

public interface Crud <T>{
    //Crear y actualizar
    T save(T entidad);
    //borrar
    int delete(int id);
    //borrar todos
    boolean DeleteAll();
    //buscar por id 
    Optional<T> findById(int id);
    //buscar todos 
    List<T> findAll();
}
