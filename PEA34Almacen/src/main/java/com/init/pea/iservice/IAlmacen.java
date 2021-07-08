package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Almacen;

public interface IAlmacen {

	public List<Almacen> ListarAlmacen();
	
	public int AgregarAlmacen(Almacen alm);
	
	public int ActualizarAlmacen(Almacen alm);
}
