package com.swapi.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.swapi.dao.entity.Usuario;
public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {
}