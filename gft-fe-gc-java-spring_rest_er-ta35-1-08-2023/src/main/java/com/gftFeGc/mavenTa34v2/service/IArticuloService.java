package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Articulo;

public interface IArticuloService {
	//Metodos del CRUD
		public List<Articulo> listarArticulos(); //Listar All 
		
		public Articulo guardarArticulo(Articulo articulo);	//Guarda un cliente CREATE
		
		public Articulo articuloXID(Long id); //Leer datos de un cliente READ
		
		public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del cliente UPDATE
		
		public void eliminarArticulo(Long id);// Elimina el cliente DELETE

}
