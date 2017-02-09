package com.godared.cuotacolegiado.dao;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.Documento;

@Repository
public class DocumentoDaoImp extends AbstractJpaDAO<Documento> implements IDocumentoDao{
	public DocumentoDaoImp() {
        super();

        setClazz(Documento.class);
    }
}
