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

import com.miranda.demo.interfacesService.IProductosService;
import com.miranda.demo.model.Productos;

@Controller
@RequestMapping
public class ProductosController {

	@Autowired
	private IProductosService service;
	
	@GetMapping("/listarprod")
	public String listar(Model model) {
		List<Productos>productos= service.listar();
		model.addAttribute("productos",productos);
		return "indexproductos";
	}
	
	@GetMapping("/nuevoprod")
	public String agregar(Model model) {
		model.addAttribute("productos",new Productos());
		return "formproductos";
	}
	
	@PostMapping("/guardarprod")
	public String save (Productos p , Model model) {
		service.save(p);
		return "redirect:/listarprod";
	}
	
	@GetMapping("/editarprod/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Productos>productos = service.listarId(id);
		model.addAttribute("productos",productos);
		return "formproductos";
	}
	
	@GetMapping("/eliminarprod/{id}")
	public String delete(Model mode, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarprod";
	}
	
}
