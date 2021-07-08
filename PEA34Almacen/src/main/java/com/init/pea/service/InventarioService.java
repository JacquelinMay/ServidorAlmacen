package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.InventarioDAO;
import com.init.pea.iservice.Iinventario;
import com.init.pea.modelo.Inventario;

@Service
public class InventarioService implements Iinventario {

	@Autowired
	private InventarioDAO dao;
	
	@Override
	public List<Inventario> ListarInventario() {
	
		return (List<Inventario>) dao.findAll();
	}

	@Override
	public int AgregarInventario(Inventario inv) {
		if(inv == null) {
			return 0;
		}
		dao.save(inv);
		return 1;
	}

	@Override
	public int ActualizarInventario(Inventario inv) {
		if(inv == null) {
			return 0;
		}
		dao.save(inv);
		return 1;
	}

}
