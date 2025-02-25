package com.david.backend.servicios;
import org.springframework.stereotype.Service;

import com.david.backend.repositorios.RepoEspecialidad;
import com.david.backend.repositorios.RepoEvaluacion;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ServicioEvaluacion {
     private final RepoEvaluacion repoEvaluacion;
}
