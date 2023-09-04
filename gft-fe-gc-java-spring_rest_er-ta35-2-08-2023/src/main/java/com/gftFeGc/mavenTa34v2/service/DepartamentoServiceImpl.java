package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftFeGc.mavenTa34v2.dao.IDepartamentoDAO;
import com.gftFeGc.mavenTa34v2.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instaciaramos.
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamento() {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		iDepartamentoDAO.deleteById(id);
		
	}

}
