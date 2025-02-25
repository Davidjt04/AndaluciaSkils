package com.david.backend.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.entidades.Especialidad;
import com.david.backend.servicios.ServicioEspecialidad;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/Especialidad")
@RequiredArgsConstructor
public class ControlEspecialidad {
    private ServicioEspecialidad servicioEspecialidad;
    @GetMapping("/todos")
    public ResponseEntity<List<Especialidad>> findAll() {
        List<Especialidad> especialidades = servicioEspecialidad.findAll();
        return ResponseEntity.ok(especialidades);
    }
        
// @GetMapping para obtener los datos de los clientes.
// @PostMapping para crear un nuevo cliente.
// @PutMapping para actualizar un cliente existente.
// @DeleteMapping para eliminar un cliente




/*@RestController
@RequiredArgsConstructor
public class EspecialidadController {

    // Inyectamos el servicio en el controlador
    private final EspecialidadService especialidadService;

    // Endpoint para obtener una especialidad por su ID
    @GetMapping("/especialidades/{id}")
    public ResponseEntity<Especialidad> findById(@PathVariable Long id) {
        // Llamamos al servicio para obtener la especialidad
        return especialidadService.findById(id)
                .map(ResponseEntity::ok)  // Si la especialidad existe, la devolvemos con estado 200 OK
                .orElseGet(() -> ResponseEntity.notFound().build()); // Si no existe, devolvemos 404 Not Found
    }
} */

}
