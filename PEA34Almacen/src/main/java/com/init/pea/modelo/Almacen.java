package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "almacen")
public class Almacen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idalmacen;
	public String descalmacen;
	public int stockmaximo;
	public int estado;
	public String descestado;
	
	public Almacen(int idalmacen, String descalmacen, int stockmaximo, int estado, String descestado) {
		super();
		this.idalmacen = idalmacen;
		this.descalmacen = descalmacen;
		this.stockmaximo = stockmaximo;
		this.estado = estado;
		this.descestado = descestado;
	}

	public Almacen() {
		super();
	}

	public int getIdalmacen() {
		return idalmacen;
	}

	public void setIdalmacen(int idalmacen) {
		this.idalmacen = idalmacen;
	}

	public String getDescalmacen() {
		return descalmacen;
	}

	public void setDescalmacen(String descalmacen) {
		this.descalmacen = descalmacen;
	}

	public int getStockmaximo() {
		return stockmaximo;
	}

	public void setStockmaximo(int stockmaximo) {
		this.stockmaximo = stockmaximo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getDescestado() {
		return descestado;
	}

	public void setDescestado(String descestado) {
		this.descestado = descestado;
	}
	
	
}
