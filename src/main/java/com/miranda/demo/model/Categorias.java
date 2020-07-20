package com.miranda.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {


	@Id
	private  int idcategoria;
	@Column(name="nombrecategoria",length=50)
	private  String nombrecategoria;
	@Column(name="descripcion",length=50)
	private String descripcion;
	
	
	
	
	public Categorias() {
		super();
	}




	public Categorias(int idcategoria, String nombrecategoria, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.nombrecategoria = nombrecategoria;
		this.descripcion = descripcion;
	}




	public int getIdcategoria() {
		return idcategoria;
	}




	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}




	public String getNombrecategoria() {
		return nombrecategoria;
	}




	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	@Override
	public String toString() {
		return "Categorias [idcategoria=" + idcategoria + ", nombrecategoria=" + nombrecategoria + ", descripcion="
				+ descripcion + "]";
	}
	
	
}
