package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.Documento;

public interface IDocumentoDao {
	Documento findOne(int id);
    List<Documento> findAll();
    void create(Documento entity);
    Documento update(Documento entity);
    void delete(Documento entity);
    void deleteById(int entityId);
}
