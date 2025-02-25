package com.david.backend.servicios;
import org.springframework.stereotype.Service;

import com.david.backend.repositorios.RepoEspecialidad;
import com.david.backend.repositorios.RepoUsuario;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicioUsuario {
    private final RepoUsuario repoUssuario;

}
