package com.miranda.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {

	@Id
	private int id;
	@Column(name="nombreproducto",length=40,nullable = false)
	private String nombreproducto;
	@Column(name="idproveedor",length=11)
	private int idproveedor;
	@Column(name="idcategoria", length=11)
	private int idcategoria;
	@Column(name="cantidadporunidad")
	private String cantidadporunidad;
	@Column(name="preciounidad")
	private String preciounidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getCantidadporunidad() {
		return cantidadporunidad;
	}
	public void setCantidadporunidad(String cantidadporunidad) {
		this.cantidadporunidad = cantidadporunidad;
	}
	public String getPreciounidad() {
		return preciounidad;
	}
	public void setPreciounidad(String preciounidad) {
		this.preciounidad = preciounidad;
	}
	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombreproducto=" + nombreproducto + ", idproveedor=" + idproveedor
				+ ", idcategoria=" + idcategoria + ", cantidadporunidad=" + cantidadporunidad + ", preciounidad="
				+ preciounidad + "]";
	}
	public Productos(int id, String nombreproducto, int idproveedor, int idcategoria, String cantidadporunidad,
			String preciounidad) {
		super();
		this.id = id;
		this.nombreproducto = nombreproducto;
		this.idproveedor = idproveedor;
		this.idcategoria = idcategoria;
		this.cantidadporunidad = cantidadporunidad;
		this.preciounidad = preciounidad;
	}
	public Productos() {
		super();
	}
	
	
	
}
