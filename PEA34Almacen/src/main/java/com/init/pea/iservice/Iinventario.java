package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Inventario;

public interface Iinventario {


	public List<Inventario> ListarInventario();
	
	public int AgregarInventario(Inventario inv);
	
	public int ActualizarInventario(Inventario inv);
}
