package com.godared.cuotacolegiado.dao;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.godared.cuotacolegiado.bean.Usp_S_VeGetAllVentaByMes;
import com.godared.cuotacolegiado.bean.Venta;

@Repository
public class VentaDaoImp extends AbstractJpaDAO<Venta> implements IVentaDao {
	public VentaDaoImp() {
        super();

        setClazz(Venta.class);
    }
	//
	@SuppressWarnings("unchecked")
    public  List<Usp_S_VeGetAllVentaByMes> GetAllVentaByMes(int mes){
    	StoredProcedureQuery storedProcedure  = entityManager.createNamedStoredProcedureQuery("Usp_S_VeGetAllVentaByMes");
 	    storedProcedure.setParameter("mes",mes);
 	    return storedProcedure.getResultList();
    }
}
