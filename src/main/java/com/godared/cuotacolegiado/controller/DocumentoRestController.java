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
import com.godared.cuotacolegiado.bean.Documento;
import com.godared.cuotacolegiado.service.IVentaService;

@RestController
@RequestMapping("/rest")
public class DocumentoRestController {
	@Autowired
	IVentaService ventaService;
	
	@RequestMapping(value = "/documento", method=RequestMethod.GET)
	public List<Documento> ListAll() {
		return ventaService.findAllDocumento();
	}
	@RequestMapping(value="/documento/{id}", method=RequestMethod.GET)
	public Documento GetById(@PathVariable("id") int doId) {
		Documento documento=ventaService.findOneDocumento(doId);
		if(documento==null)
		{
			throw new RestException(1,"Documento no enccontrado"," Documento con id:"+ doId + " No encontrado en el sistema");
		}
		return documento;
	}
	@RequestMapping(value="/documento/new", method=RequestMethod.GET)
	public Documento New(){
		return new Documento();
	}
	@RequestMapping(value="/documento/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		ventaService.deleteByIdDocumento(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
