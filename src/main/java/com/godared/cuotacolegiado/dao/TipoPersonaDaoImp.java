package com.godared.cuotacolegiado.dao;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.TipoPersona;

@Repository
public class TipoPersonaDaoImp extends AbstractJpaDAO<TipoPersona> implements ITipoPersonaDao {
	public TipoPersonaDaoImp() {
        super();

        setClazz(TipoPersona.class);
    }
}
