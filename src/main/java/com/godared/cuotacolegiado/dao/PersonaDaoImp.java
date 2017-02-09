package com.godared.cuotacolegiado.dao;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.Persona;
import com.godared.cuotacolegiado.bean.Usp_S_PeGetAllPersonaByTermino;

@Repository
public class PersonaDaoImp  extends AbstractJpaDAO<Persona> implements IPersonaDao {
	public PersonaDaoImp() {
        super();

        setClazz(Persona.class);        
    }
	@SuppressWarnings("unchecked")
	public List<Usp_S_PeGetAllPersonaByTermino> getAllPersonaByTermino(String termino,int tiPe){
		StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("Usp_S_PeGetAllPersonaByTermino");
 	    storedProcedure.setParameter("termino",termino);
 	   storedProcedure.setParameter("tiPe",tiPe);
 	    return storedProcedure.getResultList();
	}
}
