package com.init.pea.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pedidointerno")
public class Pedidointerno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idpedidointerno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	private String detalle;
	public int getIdpedidointerno() {
		return idpedidointerno;
	}
	public void setIdpedidointerno(int idpedidointerno) {
		this.idpedidointerno = idpedidointerno;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
}
