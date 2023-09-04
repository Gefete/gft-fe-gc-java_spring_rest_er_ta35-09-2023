package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Fabricante;

public interface IFabricanteService {
	//Metodos del CRUD
	public List<Fabricante> listarFabricante(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un cliente CREATE
	
	public Fabricante fabricanteXID(Long id); //Leer datos de un cliente READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del cliente UPDATE
	
	public void eliminarFabricante(Long id);// Elimina el cliente DELETE
}
