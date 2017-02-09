package com.godared.cuotacolegiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.godared.cuotacolegiado.RestException;
import com.godared.cuotacolegiado.bean.Operacion;
import com.godared.cuotacolegiado.service.IVentaService;

@RestController
@RequestMapping("/rest")
public class OperacionRestController {
	@Autowired
	IVentaService ventaService;
	
	@RequestMapping(value = "/operacion", method=RequestMethod.GET)
	public List<Operacion> ListAll() {
		return ventaService.findAllOperacion();
	}
	@RequestMapping(value="/operacion/{id}", method=RequestMethod.GET)
	public Operacion GetById(@PathVariable("id") int doId) {
		Operacion operacion=ventaService.findOneOperacion(doId);
		if(operacion==null)
		{
			throw new RestException(1,"Operacion no enccontrado"," Operacion con id:"+ doId + " No encontrado en el sistema");
		}
		return operacion;
	}
	@RequestMapping(value="/operacion/new", method=RequestMethod.GET)
	public Operacion New(){
		return new Operacion();
	}
	@RequestMapping(value="/operacion/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> Delete(@PathVariable("id") int id) {
		ventaService.deleteByIdOperacion(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

}
