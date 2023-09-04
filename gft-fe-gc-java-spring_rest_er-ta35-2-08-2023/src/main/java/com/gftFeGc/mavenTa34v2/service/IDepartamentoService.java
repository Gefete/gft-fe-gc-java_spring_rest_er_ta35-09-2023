package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Departamento;

public interface IDepartamentoService {
	//Metodos del CRUD
	public List<Departamento> listarDepartamento(); //Listar All 
	
	public Departamento guardarDepartamento(Departamento departamento);	//Guarda un cliente CREATE
	
	public Departamento departamentoXID(Long id); //Leer datos de un cliente READ
	
	public Departamento actualizarDepartamento(Departamento departamento); //Actualiza datos del cliente UPDATE
	
	public void eliminarDepartamento(Long id);// Elimina el cliente DELETE
}
