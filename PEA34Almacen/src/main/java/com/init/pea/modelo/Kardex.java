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
@Table(name = "kardex")
public class Kardex {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idkardex;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private int salida;
	private int ingreso;
	private String detalle;
	private int estado;
	
	
	
	public int getIdkardex() {
		return idkardex;
	}
	public void setIdkardex(int idkardex) {
		this.idkardex = idkardex;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getSalida() {
		return salida;
	}
	public void setSalida(int salida) {
		this.salida = salida;
	}
	public int getIngreso() {
		return ingreso;
	}
	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}


	
	
}
