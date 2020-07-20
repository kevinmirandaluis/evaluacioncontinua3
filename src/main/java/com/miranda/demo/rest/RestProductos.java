package com.miranda.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miranda.demo.interfaces.IProductos;
import com.miranda.demo.model.Productos;

@RestController
@RequestMapping("/rest_prod")
public class RestProductos {

	@Autowired
	private IProductos data;

	@GetMapping
	public List<Productos> listar() 
	{
	return (List<Productos>)data.findAll();
	}

    @GetMapping(value ="/{id}")
	public Optional<Productos> listar(@PathVariable("id") Integer id) {	
	return data.findById(id);
	}

	@PostMapping
	public void insertar(@RequestBody Productos prod) 
	{
	data.save(prod);
	}

	@PutMapping
	public void modificar(@RequestBody Productos prod) {
	    data.save(prod);
	}

	@DeleteMapping(value ="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
	    data.deleteById(id);
	}    

	
}
