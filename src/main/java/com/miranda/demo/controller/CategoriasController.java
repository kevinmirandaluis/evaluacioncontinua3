package com.miranda.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miranda.demo.interfacesService.ICategoriasService;
import com.miranda.demo.model.Categorias;

@Controller
@RequestMapping
public class CategoriasController {

	@Autowired
	private ICategoriasService service;
	
	@GetMapping("/listarcat")
	public String listar(Model model) {
		List<Categorias>categorias= service.listar();
		model.addAttribute("categorias",categorias);
		return "indexcategorias";
	}
	
	@GetMapping("/nuevacat")
	public String agregar(Model model) {
		model.addAttribute("categorias",new Categorias());
		return "formcategorias";
	}
	
	@PostMapping("/guardarcat")
	public String save (Categorias p , Model model) {
		service.save(p);
		return "redirect:/listarcat";
	}
	
	@GetMapping("/editarcat/{idcategoria}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Categorias>categoria = service.listarId(id);
		model.addAttribute("categorias",categoria);
		return "formcategorias";
	}
	
	@GetMapping("/eliminarcat/{idcategoria}")
	public String delete(Model mode, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarcat";
	}
	
}
