package com.init.pea.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prxpe")
public class Prxpe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idprxpe;
	
	@ManyToOne
	@JoinColumn(name="idpedidointerno")
	private Pedidointerno pedidointerno;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private Productos producto;

	public int getIdprxpe() {
		return idprxpe;
	}

	public void setIdprxpe(int idprxpe) {
		this.idprxpe = idprxpe;
	}

	public Pedidointerno getPedidointerno() {
		return pedidointerno;
	}

	public void setPedidointerno(Pedidointerno pedidointerno) {
		this.pedidointerno = pedidointerno;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
	
}
