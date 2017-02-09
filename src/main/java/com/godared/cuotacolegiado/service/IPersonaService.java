package com.godared.cuotacolegiado.service;

import java.util.List;


import com.godared.cuotacolegiado.bean.Persona;
import com.godared.cuotacolegiado.bean.TipoIdentidad;
import com.godared.cuotacolegiado.bean.TipoPersona;
import com.godared.cuotacolegiado.bean.Usp_S_PeGetAllPersonaByTermino;

public interface IPersonaService {
	 //Persona
	 List<Persona> findAll();
	 Persona findOne(int peId);
	 void deleteById(int peId);
	 void create(Persona persona);
	 Persona update(Persona persona);
	 List<Usp_S_PeGetAllPersonaByTermino> getAllPersonaByTermino(String termino,int tiPe);
	 //TipoPersona
	 List<TipoPersona> findAllTipoPersona();
	 TipoPersona findOneTipoPersona(int tiPeId);
	 void deleteByIdTipoPersona(int tiPeId);
	 void createTipoPersona(TipoPersona tipoPersona);
	 TipoPersona updateTipoPersona(TipoPersona tipoPersona);
	 //TipoIdentidad
	 List<TipoIdentidad> findAllTipoIdentidad();
	 TipoIdentidad findOneTipoIdentidad(int tiIdId);
	 void deleteByIdTipoIdentidad(int tiIdId);
	 void createTipoIdentidad(TipoIdentidad tipoIdentidad);
	 TipoIdentidad updateTipoIdentidad(TipoIdentidad tipoIdentidad);
}
