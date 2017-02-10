package com.godared.cuotacolegiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.godared.cuotacolegiado.controller.RequestWrapper;
import com.godared.cuotacolegiado.RestException;
import com.godared.cuotacolegiado.bean.Usp_S_VeGetAllVentaByMes;
import com.godared.cuotacolegiado.bean.Venta;
import com.godared.cuotacolegiado.service.IVentaService;

@RestController
@RequestMapping("/rest")
public class VentaRestController {
	@Autowired
	IVentaService ventaService;
	
	@RequestMapping(value = "/venta", method=RequestMethod.GET)
	public List<Venta> List() {
		return ventaService.findAll();
	}
	@RequestMapping(value="/venta/{id}", method=RequestMethod.GET)
	public Venta Get(@PathVariable("id") int veId) {
		Venta venta=ventaService.findOne(veId);
		if(venta==null)
		{
			throw new RestException(1,"Ruta no enccontrado"," Tramite con id:"+ veId + " No encontrado en el sistema");
		}
		return ventaService.findOne(veId);
	}
	
	@RequestMapping(value="/venta/new", method=RequestMethod.GET)
	public Venta NewVenta(){
		return new Venta();
	}
	
	@RequestMapping(value = "/venta/save", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Boolean> save(@RequestBody RequestWrapper requestWrapper) {
		
		ventaService.Save(requestWrapper.getVenta(), requestWrapper.getVentaDetalle());;
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	@RequestMapping(value="/venta/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		ventaService.Delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	//http://localhost:8080/CuotaColegiado/rest/venta/getallventabymes?mes=2
	@RequestMapping(value = "/venta/getallventabymes",params = {"mes"}, method=RequestMethod.GET)
	public List<Usp_S_VeGetAllVentaByMes> GetAllVentaByMes(@RequestParam("mes") int mes) {
		return ventaService.GetAllVentaByMes(mes);
	}
	

}
