package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.Venta;

public interface IVentaDao {
	Venta findOne(int id);
    List<Venta> findAll();
    void create(Venta entity);
    Venta update(Venta entity);
    void delete(Venta entity);
    void deleteById(int entityId);
}
