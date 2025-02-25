package com.david.backend.servicios;

import org.springframework.stereotype.Service;

import com.david.backend.repositorios.RepoEspecialidad;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ServicioPrueba {
    private final RepoEspecialidad repoEpecialidad;

}
