package com.david.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.david.backend.entidades.Especialidad;
import com.david.interfaces.Crud;

/*No hace falta la interface crud,JpaRepository tiene todos los metodos del CRUD*/
/*@PersistenceContext-> se utiliza para inyectar entityManager y este es el que 
hace posible la comunicacion con la BD */
public interface RepoEspecialidad extends JpaRepository<Especialidad,Integer>{
/*saveAndFlush-> crear un actualizar*/

/*saveAndFlush-> crear un actualizar*/

/*deleteAllInBatch-> elimina todos los registros*/

/*deleteAllByIdInBatch-> borar por id*/

/*	void deleteAllInBatch(Iterable<T> entities)-> le pasas una lista y borra todos 
los componentes de la misma */

/*
<S extends T> List<S> findAll(Example<S> example);
<S extends T> List<S> findAll(Example<S> example, Sort sort)
los dos buscan pero uno te devyuelve la lista ordenada */

/*FindByID(ID id)*/



}

