package com.gftFeGc.mavenTa34v2.service;

import java.util.List;


import com.gftFeGc.mavenTa34v2.dto.Empleado;

public interface IEmpleadoService {
	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un cliente CREATE
	
	public Empleado empleadoXID(String dni); //Leer datos de un cliente READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del cliente UPDATE
	
	public void eliminarEmpleado(String dni);// Elimina el cliente DELETE
}
