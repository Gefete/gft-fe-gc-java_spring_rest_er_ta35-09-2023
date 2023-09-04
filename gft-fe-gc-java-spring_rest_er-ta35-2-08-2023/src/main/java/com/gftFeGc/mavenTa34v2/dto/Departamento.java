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
@Table(name="departamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "presupuesto")
	private int presupuesto;
	
	
	@OneToMany(mappedBy="departamento")
	private Set<Empleado> empleados;


	public Departamento() {
	}


	public Departamento(int codigo, String nombre, int presupuesto, Set<Empleado> empleados) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleados = empleados;
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


	public int getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}
