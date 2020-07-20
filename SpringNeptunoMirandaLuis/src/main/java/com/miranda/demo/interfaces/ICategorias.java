package com.miranda.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miranda.demo.model.Categorias;


@Repository
public interface ICategorias extends CrudRepository<Categorias,Integer>{

	
}
