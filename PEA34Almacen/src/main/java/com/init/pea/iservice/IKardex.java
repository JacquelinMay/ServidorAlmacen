package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Kardex;

public interface IKardex {

	public List<Kardex> ListarKardex();
	
	public int AgregarKardex(Kardex kar);
	
	public int ActualizarKardex(Kardex kar);
}
