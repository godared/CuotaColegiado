package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.Persona;
import com.godared.cuotacolegiado.bean.Usp_S_PeGetAllPersonaByTermino;

public interface IPersonaDao {
	Persona findOne(int id);
    List<Persona> findAll();
    void create(Persona entity);
    Persona update(Persona entity);
    void delete(Persona entity);
    void deleteById(int entityId);
    List<Usp_S_PeGetAllPersonaByTermino> getAllPersonaByTermino(String termino,int tiPe);
}
