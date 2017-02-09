package com.godared.cuotacolegiado.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godared.cuotacolegiado.bean.Persona;
import com.godared.cuotacolegiado.bean.TipoIdentidad;
import com.godared.cuotacolegiado.bean.TipoPersona;
import com.godared.cuotacolegiado.bean.Usp_S_PeGetAllPersonaByTermino;
import com.godared.cuotacolegiado.dao.IPersonaDao;
import com.godared.cuotacolegiado.dao.ITipoIdentidadDao;
import com.godared.cuotacolegiado.dao.ITipoPersonaDao;

@Service
@Transactional
public class PersonaServiceImp implements IPersonaService{
	private IPersonaDao personaDao;
	private ITipoPersonaDao tipoPersonaDao;
	private ITipoIdentidadDao tipoIdentidadDao;
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	//inyectamos el dao
	public void setPersonaDao(IPersonaDao personaDao) {
		 this.personaDao = personaDao;		 
	}
	public void setTipoPersonaDao(ITipoPersonaDao tipoPersonaDao) {
		 this.tipoPersonaDao = tipoPersonaDao;		 
	}
	public void setTipoIdentidadDao(ITipoIdentidadDao tipoIdentidadDao) {
		 this.tipoIdentidadDao = tipoIdentidadDao;		 
	}
	//Persona
	public List<Persona> findAll(){
		 return this.personaDao.findAll();
	 }
	public Persona findOne(int peId){
		 return this.personaDao.findOne(peId);
	 }
	public void deleteById(int peId){
		 this.personaDao.deleteById(peId);
	 }
	public void create(Persona persona){
		 this.personaDao.create(persona);
	 }
	public Persona update(Persona persona){
		 return this.personaDao.update(persona);
	 }
	public List<Usp_S_PeGetAllPersonaByTermino> getAllPersonaByTermino(String termino,int tiPe){
		return this.personaDao.getAllPersonaByTermino(termino,tiPe);
	}
	//TipoPersona
	public List<TipoPersona> findAllTipoPersona(){
		 return this.tipoPersonaDao.findAll();
	}
	public TipoPersona findOneTipoPersona(int tiPeId){
		return this.tipoPersonaDao.findOne(tiPeId);
	}
	public void deleteByIdTipoPersona(int tiPeId){
		this.tipoPersonaDao.deleteById(tiPeId);
	}
	public void createTipoPersona(TipoPersona tipoPersona){
		this.tipoPersonaDao.create(tipoPersona);
	}
	public TipoPersona updateTipoPersona(TipoPersona tipoPersona){
		 return this.tipoPersonaDao.update(tipoPersona);
	 }
	//tipoidentidad
	public List<TipoIdentidad> findAllTipoIdentidad(){
		 return this.tipoIdentidadDao.findAll();
	}
	public TipoIdentidad findOneTipoIdentidad(int tiIdId){
		return this.tipoIdentidadDao.findOne(tiIdId);
	}
	public void deleteByIdTipoIdentidad(int tiIdId){
		this.tipoIdentidadDao.deleteById(tiIdId);
	}
	public void createTipoIdentidad(TipoIdentidad tipoIdentidad){
		this.tipoIdentidadDao.create(tipoIdentidad);
	}
	public TipoIdentidad updateTipoIdentidad(TipoIdentidad tipoIdentidad){
		 return this.tipoIdentidadDao.update(tipoIdentidad);
	}
}
