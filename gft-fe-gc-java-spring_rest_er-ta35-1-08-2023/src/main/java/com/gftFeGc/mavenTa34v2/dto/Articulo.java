package com.gftFeGc.mavenTa34v2.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante", nullable=false)
	private Fabricante fabricante;

	//Constructor
	public Articulo() {
	}

	public Articulo(int codigo, String nombre, int precio, Fabricante fabricante) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	
}
