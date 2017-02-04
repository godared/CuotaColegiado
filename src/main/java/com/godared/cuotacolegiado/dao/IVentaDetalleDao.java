package com.godared.cuotacolegiado.dao;

import java.util.List;

import com.godared.cuotacolegiado.bean.VentaDetalle;

public interface IVentaDetalleDao {
	VentaDetalle findOne(int id);
    List<VentaDetalle> findAll();
    void create(VentaDetalle entity);
    VentaDetalle update(VentaDetalle entity);
    void delete(VentaDetalle entity);
    void deleteById(int entityId);
}
