package com.gftFeGc.mavenTa34v2.dto;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="fabricante")
	private Set<Articulo> articulos;

	//Constructor
	public Fabricante() {
	}

	//=== SETTERS ===
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//=== GETTERS ===
	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}
}
