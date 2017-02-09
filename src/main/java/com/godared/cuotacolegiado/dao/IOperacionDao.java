package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.Operacion;

public interface IOperacionDao {
	Operacion findOne(int id);
    List<Operacion> findAll();
    void create(Operacion entity);
    Operacion update(Operacion entity);
    void delete(Operacion entity);
    void deleteById(int entityId);
}
