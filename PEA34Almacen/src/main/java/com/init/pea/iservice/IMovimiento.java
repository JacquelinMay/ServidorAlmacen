package com.init.pea.iservice;

import java.util.List;

import com.init.pea.modelo.Movimiento;



public interface IMovimiento {
	
	public List<Movimiento> ListarMovimiento();
	
	public int AgregarMovimiento(Movimiento mov);
	
}
