package com.init.pea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.pea.dao.PrxpeDAO;
import com.init.pea.iservice.IPrxpe;
import com.init.pea.modelo.Prxpe;

@Service
public class PrxpeService implements IPrxpe {

	@Autowired
	private PrxpeDAO dao;
	
	@Override
	public List<Prxpe> ListarProdxPed() {
		return (List<Prxpe>)dao.findAll();
	}

	
}
