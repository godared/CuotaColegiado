package com.godared.cuotacolegiado.dao;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.Venta;

@Repository
public class VentaDaoImp extends AbstractJpaDAO<Venta> implements IVentaDao {
	public VentaDaoImp() {
        super();

        setClazz(Venta.class);
    }
}
