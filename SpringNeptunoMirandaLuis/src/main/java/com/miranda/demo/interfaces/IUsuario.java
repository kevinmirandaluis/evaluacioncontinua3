package com.miranda.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miranda.demo.model.Usuario;


@Repository
public interface IUsuario extends CrudRepository <Usuario,Integer>{

	Usuario findBynombre(String nombre);
}
