package com.init.pea.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "movimiento")
public class Movimiento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmovimiento;
	
	@ManyToOne
	@JoinColumn(name = "almacenid")
	private Almacen almacen;
	
	@ManyToOne
	@JoinColumn(name = "prxpeid")
	private Prxpe idprxpeid;
	
	@ManyToOne
	@JoinColumn(name = "inventarioid")
	private Inventario inventario;
	@ManyToOne
	@JoinColumn(name = "empleadoid")
	private Empleado empleado;
	@ManyToOne
	@JoinColumn(name = "kardexid")
	private Kardex kardex;
	
	private String tipomovimiento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	private int estado;
	
	
	
	
	
	
	
}
