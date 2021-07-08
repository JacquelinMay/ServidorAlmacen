package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.AlmacenDAO;
import com.init.pea.iservice.IAlmacen;
import com.init.pea.modelo.Almacen;

@Service
public class AlmacenService implements IAlmacen{
	
	@Autowired
	private AlmacenDAO repoAlmacen;
	
	@Override
	public List<Almacen> ListarAlmacen() {
		return (List<Almacen>) repoAlmacen.findAll();
	}

	@Override
	public int AgregarAlmacen(Almacen alm) {
		if(alm == null) {
			return 0;
		}
		repoAlmacen.save(alm);
		return 1;
	}

	@Override
	public int ActualizarAlmacen(Almacen alm) {
		if(alm == null) {
			return 0;
		}
		repoAlmacen.save(alm);
		return 1;
	}

}
