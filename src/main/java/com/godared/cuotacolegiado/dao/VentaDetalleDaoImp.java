package com.godared.cuotacolegiado.dao;


import com.godared.cuotacolegiado.bean.VentaDetalle;

public class VentaDetalleDaoImp extends AbstractJpaDAO<VentaDetalle> implements IVentaDetalleDao {
	 public VentaDetalleDaoImp() {
	        super();
	        setClazz(VentaDetalle.class);
	    }
}
