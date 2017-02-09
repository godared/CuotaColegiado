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
import com.godared.cuotacolegiado.bean.TipoIdentidad;

import com.godared.cuotacolegiado.service.IPersonaService;

@RestController
@RequestMapping("/rest")
public class TipoIdentidadRestController {
	@Autowired
	IPersonaService personaService;
	@RequestMapping(value = "/tipoidentidad", method=RequestMethod.GET)
	
	public List<TipoIdentidad> ListAll() {
		return personaService.findAllTipoIdentidad();
	}
	@RequestMapping(value="/tipoidentidad/{id}", method=RequestMethod.GET)
	public TipoIdentidad GetById(@PathVariable("id") int tiIdId) {
		TipoIdentidad tipoIdentidad=personaService.findOneTipoIdentidad(tiIdId);
		if(tipoIdentidad==null)
		{
			throw new RestException(1,"TipoIdentidad no enccontrado"," TipoIdentidad con id:"+ tiIdId + " No encontrado en el sistema");
		}
		return tipoIdentidad;
	}
	@RequestMapping(value="/tipoidentidad/new", method=RequestMethod.GET)
	public TipoIdentidad New(){
		return new TipoIdentidad();
	}
	@RequestMapping(value="/tipoidentidad/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> Delete(@PathVariable("id") int id) {
		personaService.deleteByIdTipoIdentidad(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
