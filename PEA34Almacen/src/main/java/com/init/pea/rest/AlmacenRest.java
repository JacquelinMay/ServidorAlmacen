package com.init.pea.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.init.pea.iservice.IAlmacen;
import com.init.pea.iservice.IKardex;
import com.init.pea.iservice.IMovimiento;
import com.init.pea.iservice.IPrxpe;
import com.init.pea.iservice.Iinventario;
import com.init.pea.modelo.Almacen;
import com.init.pea.modelo.Inventario;
import com.init.pea.modelo.Kardex;
import com.init.pea.modelo.Movimiento;
import com.init.pea.modelo.Prxpe;

@RestController
@RequestMapping("/almacen")
public class AlmacenRest {

	@Autowired
	private IAlmacen almacenService;
	
	@Autowired
	private Iinventario inventarioService;
	
	@Autowired
	private IKardex kardesService;
	
	@Autowired
	private IMovimiento movimiento;
	
	@Autowired
	private IPrxpe prxpe;
	
	/*--------------------------ALMACEN--------------------------*/
	@GetMapping("/listarAlmacen")
	public List<Almacen> listarAlmacen(){
		return almacenService.ListarAlmacen();
	}
	
	@PostMapping("/guardarAlmacen")
	public void guardarAlmacen(@RequestBody Almacen alm) {
		int estado = almacenService.AgregarAlmacen(alm);
	}
	
	@PutMapping("/actualizarAlmacen")
	public void actualizarAlmacen(@RequestBody Almacen alm) {
		int estado = almacenService.ActualizarAlmacen(alm);	
	}
	/*--------------------------INVENTARIO--------------------------*/
	
	@GetMapping("/listarInventario")
	public List<Inventario> listaInventario(){
		return inventarioService.ListarInventario();
	}
	
	@PostMapping("/guardarInventario")
	public void AgregarInventario(@RequestBody Inventario inv) {
		int estado= inventarioService.AgregarInventario(inv);
	}
	
	@PutMapping("/actualizarInventario")
	public void ActualizarInventario(@RequestBody Inventario inv) {
		int estado= inventarioService.ActualizarInventario(inv);
	}
	
	/*--------------------------KARDEX--------------------------*/
	
	@GetMapping("/listarKardex")
	public List<Kardex> listarKardex(){
		return kardesService.ListarKardex();
	}
	
	@PostMapping("/guardarKardex")
	public void guardarKardex(@RequestBody Kardex kr) {
		int estado = kardesService.AgregarKardex(kr);
	}
	
	@PutMapping("/actualizarKardex")
	public void actualizarKardex(@RequestBody Kardex kr) {
		int estado = kardesService.ActualizarKardex(kr);	
	}
	
	
	/*--------------------------MOVIMIENTO--------------------------*/
	@GetMapping("/listarMovimiento")
	public List<Movimiento> listarMovimiento(){
		return movimiento.ListarMovimiento();
	}
	
	@PostMapping("/guardarMovimiento")
	public void guardarMovimiento(@RequestBody Movimiento mv) {
		int estado =movimiento.AgregarMovimiento(mv);
	}
	
	/*--------------------------PRXPE--------------------------*/
	@GetMapping("/listarPrxpe")
	public List<Prxpe> listarPrxPE(){
		return prxpe.ListarProdxPed();
	}
}
