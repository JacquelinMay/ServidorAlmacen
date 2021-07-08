package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.MovimientoDAO;
import com.init.pea.iservice.IMovimiento;
import com.init.pea.modelo.Kardex;
import com.init.pea.modelo.Movimiento;

@Service
public class MovimientoService implements IMovimiento {

	@Autowired
	private MovimientoDAO movedao;
	
	@Override
	public List<Movimiento> ListarMovimiento() {
		return (List<Movimiento>) movedao.findAll();
	}

	@Override
	public int AgregarMovimiento(Movimiento mov) {
		if(mov == null) {
			return 0;
		}
		movedao.save(mov);
		return 1;
	}
	

}
