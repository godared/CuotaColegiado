package com.godared.cuotacolegiado.dao;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.Operacion;

@Repository
public class OperacionDaoImp extends AbstractJpaDAO<Operacion> implements IOperacionDao {
	public OperacionDaoImp() {
        super();

        setClazz(Operacion.class);
    }
}
