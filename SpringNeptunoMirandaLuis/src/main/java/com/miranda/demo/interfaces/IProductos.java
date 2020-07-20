package com.miranda.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miranda.demo.model.Productos;

@Repository
public interface IProductos extends CrudRepository <Productos,Integer> {

	
}
