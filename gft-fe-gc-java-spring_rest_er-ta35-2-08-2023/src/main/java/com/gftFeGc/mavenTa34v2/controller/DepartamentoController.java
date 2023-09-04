package com.gftFeGc.mavenTa34v2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gftFeGc.mavenTa34v2.dto.Departamento;
import com.gftFeGc.mavenTa34v2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	@Autowired
	DepartamentoServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamento(){
		return departamentoServideImpl.listarDepartamento();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		
		return departamentoServideImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento departamentoXID(@PathVariable(name="id") Long id) {
		
		Departamento departamento_xid= new Departamento();
		
		departamento_xid=departamentoServideImpl.departamentoXID(id);
		
		System.out.println("Departamento XID: "+departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name="id")Long id,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServideImpl.departamentoXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServideImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El Departamento actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eleiminarDepartamento(@PathVariable(name="id")Long id) {
		departamentoServideImpl.eliminarDepartamento(id);
	}
}
