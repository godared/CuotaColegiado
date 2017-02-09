package com.godared.cuotacolegiado.dao;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.TipoIdentidad;

@Repository
public class TipoIdentidadDaoImp extends AbstractJpaDAO<TipoIdentidad> implements ITipoIdentidadDao {
	public TipoIdentidadDaoImp() {
        super();

        setClazz(TipoIdentidad.class);
    }
}
