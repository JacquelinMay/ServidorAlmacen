package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.init.pea.dao.KardexDAO;
import com.init.pea.iservice.IKardex;
import com.init.pea.modelo.Kardex;

@Service
public class KardexService implements IKardex  {

	@Autowired
	private KardexDAO karde;
	
	@Override
	public List<Kardex> ListarKardex() {
		return (List<Kardex>) karde.findAll();
	}

	@Override
	public int AgregarKardex(Kardex kar) {
		if(kar == null) {
			return 0;
		}
		karde.save(kar);
		return 1;
	}

	@Override
	public int ActualizarKardex(Kardex kar) {
		if(kar == null) {
			return 0;
		}
		karde.save(kar);
		return 1;
	}
	
	

}
