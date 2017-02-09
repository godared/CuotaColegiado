package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.TipoIdentidad;

public interface ITipoIdentidadDao {
	TipoIdentidad findOne(int id);
    List<TipoIdentidad> findAll();
    void create(TipoIdentidad entity);
    TipoIdentidad update(TipoIdentidad entity);
    void delete(TipoIdentidad entity);
    void deleteById(int entityId);
}
