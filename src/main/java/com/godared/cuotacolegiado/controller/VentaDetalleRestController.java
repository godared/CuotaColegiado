package com.godared.cuotacolegiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.godared.cuotacolegiado.RestException;
import com.godared.cuotacolegiado.bean.VentaDetalle;
import com.godared.cuotacolegiado.service.IVentaService;

@RestController
@RequestMapping("/rest")
public class VentaDetalleRestController {
	@Autowired
	IVentaService ventaService;
	
	@RequestMapping(value="/ventadetalle/{veId}", method=RequestMethod.GET)
	public VentaDetalle Get(@PathVariable("veId") int veId) {
		VentaDetalle ventaDetalle=ventaService.findOneVentaDetalleByruId(veId);
		if(ventaDetalle==null)
		{
			throw new RestException(1,"Ruta no enccontrado"," Tramite con id:"+ veId + " No encontrado en el sistema");
		}
		return ventaDetalle;
	}
	@RequestMapping(value="/ventadetalle/new", method=RequestMethod.GET)
	public VentaDetalle NewVentaDetalle(){
		return new VentaDetalle();
	}
}
