package com.miranda.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.miranda.demo.interfaces.ICategorias;
import com.miranda.demo.interfacesService.ICategoriasService;
import com.miranda.demo.model.Categorias;

@Service
public class CategoriasService implements ICategoriasService {

	@Autowired
	private ICategorias data;
	

	@Override
	public List<Categorias> listar() {
		return (List<Categorias>)data.findAll();
	}

	@Override
    public Optional<Categorias> listarId(int id) {        
        return data.findById(id);
    }
	
	@Override
	public int save(Categorias p) {
		int res = 0;
		Categorias categorias = data.save(p);
		if(!categorias.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
	data.deleteById(id);	
	}

}
