package com.godared.cuotacolegiado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.godared.cuotacolegiado.RestException;
import com.godared.cuotacolegiado.bean.Persona;
import com.godared.cuotacolegiado.bean.Usp_S_PeGetAllPersonaByTermino;
import com.godared.cuotacolegiado.service.IPersonaService;


@RestController
@RequestMapping("/rest")
public class PersonaRestController {
	@Autowired
	IPersonaService personaService;
	
	@RequestMapping(value = "/persona", method=RequestMethod.GET)
	public List<Persona> ListAll() {
		return personaService.findAll();
	}
	@RequestMapping(value="/persona/{id}", method=RequestMethod.GET)
	public Persona GetById(@PathVariable("id") int peId) {
		Persona persona=personaService.findOne(peId);
		if(persona==null)
		{
			throw new RestException(1,"Persona no enccontrado"," Persona con id:"+ peId + " No encontrado en el sistema");
		}
		return persona;
	}
	@RequestMapping(value="/persona/new", method=RequestMethod.GET)
	public Persona New(){
		return new Persona();
	}
	@RequestMapping(value="/persona/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> Delete(@PathVariable("id") int id) {
		personaService.deleteById(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	@RequestMapping(value = "/persona/getallpersonabytermino",params = {"termino","tiPe"}, method=RequestMethod.GET)
	public List<Usp_S_PeGetAllPersonaByTermino> GetAllPersonaByTermino(@RequestParam("termino") String termino,@RequestParam("tiPe") int tiPe) {
		return personaService.getAllPersonaByTermino(termino,tiPe);
	}
	
	

}
