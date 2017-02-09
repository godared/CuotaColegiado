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
import com.godared.cuotacolegiado.bean.TipoPersona;
import com.godared.cuotacolegiado.service.IPersonaService;

@RestController
@RequestMapping("/rest")
public class TipoPersonaRestController {
	@Autowired
	IPersonaService personaService;
	
	@RequestMapping(value = "/tipopersona", method=RequestMethod.GET)
	public List<TipoPersona> ListAll() {
		return personaService.findAllTipoPersona();
	}
	@RequestMapping(value="/tipopersona/{id}", method=RequestMethod.GET)
	public TipoPersona GetById(@PathVariable("id") int tiPeId) {
		TipoPersona tipoPersona=personaService.findOneTipoPersona(tiPeId);
		if(tipoPersona==null)
		{
			throw new RestException(1,"TipoPersona no enccontrado"," TipoPersona con id:"+ tiPeId + " No encontrado en el sistema");
		}
		return tipoPersona;
	}
	@RequestMapping(value="/tipopersona/new", method=RequestMethod.GET)
	public TipoPersona New(){
		return new TipoPersona();
	}
	@RequestMapping(value="/tipopersona/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> Delete(@PathVariable("id") int id) {
		personaService.deleteByIdTipoPersona(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
