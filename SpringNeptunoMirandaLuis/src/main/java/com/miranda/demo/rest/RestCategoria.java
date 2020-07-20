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

import com.miranda.demo.interfaces.ICategorias;
import com.miranda.demo.model.Categorias;

@RestController
@RequestMapping("/rest_cat")
public class RestCategoria {

	@Autowired
	private ICategorias data;

	@GetMapping
	public List<Categorias> listar() 
	{
	return (List<Categorias>)data.findAll();
	}


	@PostMapping
	public void insertar(@RequestBody Categorias cat) 
	{
	data.save(cat);
	}

	@PutMapping
	public void modificar(@RequestBody Categorias cat) {
	    data.save(cat);
	}

	@DeleteMapping(value ="/{idcategoria}")
	public void eliminar(@PathVariable("idcategoria") Integer id) {
	    data.deleteById(id);
	}    

    @GetMapping(value ="/{idcategoria}")
	public Optional<Categorias> listar(@PathVariable("idcategoria") Integer id) {	
	return data.findById(id);
	}
	
}
