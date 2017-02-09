package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.TipoPersona;

public interface ITipoPersonaDao {
	TipoPersona findOne(int id);
    List<TipoPersona> findAll();
    void create(TipoPersona entity);
    TipoPersona update(TipoPersona entity);
    void delete(TipoPersona entity);
    void deleteById(int entityId);
}
