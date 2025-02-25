package com.david.backend.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.backend.entidades.Especialidad;
import com.david.backend.repositorios.RepoEspecialidad;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicioEspecialidad {

    @Autowired
    private final RepoEspecialidad repoEpecialidad;
    

    public List<Especialidad> findAll(){
        return repoEpecialidad.findAll();
    }
}
