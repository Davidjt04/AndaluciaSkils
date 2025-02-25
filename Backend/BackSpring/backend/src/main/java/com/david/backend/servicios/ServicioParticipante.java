package com.david.backend.servicios;
import org.springframework.stereotype.Service;

import com.david.backend.repositorios.RepoParticipante;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ServicioParticipante {
        private final RepoParticipante repoParticipante;

}
