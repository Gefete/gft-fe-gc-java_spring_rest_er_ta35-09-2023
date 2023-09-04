package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftFeGc.mavenTa34v2.dao.IFabricanteDAO;
import com.gftFeGc.mavenTa34v2.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{

	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instaciaramos.
	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricante() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		iFabricanteDAO.deleteById(id);
	}

}
