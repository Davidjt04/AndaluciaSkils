package com.david.backend.servicios;
import org.springframework.stereotype.Service;

import com.david.backend.repositorios.RepoEspecialidad;
import com.david.backend.repositorios.RepoItem;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ServicioItem {
        private final RepoItem repoItem;

}
