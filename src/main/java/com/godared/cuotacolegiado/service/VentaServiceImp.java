package com.godared.cuotacolegiado.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.godared.cuotacolegiado.bean.Venta;
import com.godared.cuotacolegiado.bean.VentaDetalle;
import com.godared.cuotacolegiado.dao.IVentaDao;
import com.godared.cuotacolegiado.dao.IVentaDetalleDao;

@Service
@Transactional
public class VentaServiceImp {
	private IVentaDao ventaDao;
	private IVentaDetalleDao ventaDetalleDao;
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	public void setRutaDao(IVentaDao ventaDao) {
		 this.ventaDao = ventaDao;
		 
	}
	public void setRutaDetalleDao(IVentaDetalleDao ventaDetalleDao) {
		 this.ventaDetalleDao = ventaDetalleDao;
		 
	}
	
	public void Delete(int id){
		 this.ventaDao.deleteById(id);
	}
	public List<Venta> findAll() {
		// TODO Auto-generated method stub
		return ventaDao.findAll();
	}

	public Venta findOne(int id) {
		// TODO Auto-generated method stub
		return ventaDao.findOne(id);
	}
	public void Save(Venta venta,List<VentaDetalle> ventaDetalle) {
		// TODO Auto-generated method stub
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {		
			transaction.begin();
			if (venta.getVeId()>0)
			{
				venta.setUsFechaReg(new Date() );
				this.ventaDao.update(venta);
				//REgistramos el detalle
				for(VentaDetalle ventaDet : ventaDetalle) {
					ventaDet.setVeId(venta.getVeId());
					this.ventaDetalleDao.update(ventaDet);//System.out.println(rutaDet);
		        }
				
			}
			else
			{
				this.ventaDao.create(venta);
				//REgistramos el detalle
				for(VentaDetalle ventaDet : ventaDetalle) {
					ventaDet.setVeId(venta.getVeId());
					this.ventaDetalleDao.create(ventaDet);//System.out.println(rutaDet);
		        }			
			}
			transaction.commit();
		}
		catch(Exception e){
		    transaction.rollback();
		       throw new RuntimeException(e);
		}
		finally{
			entityManager.close();
		}
	}
	 //Ruta Detalle
		public VentaDetalle findOneVentaDetalleId(int veId){
			return ventaDetalleDao.findOne(veId);//aqui hay que hacer un procedure
		 }
		public VentaDetalle findOneVentaDetalleByruId(int veId){
			return ventaDetalleDao.findOne(veId);//aqui hay que hacer un procedure
		 }
		public void CreateVentaDetalle(VentaDetalle ventaDetalle){
			 this.ventaDetalleDao.create(ventaDetalle);
		 }
		public void UpdateVentaDetalle(int veId,VentaDetalle ventaDetalle){
			VentaDetalle _ventaDetalle=new VentaDetalle();
			_ventaDetalle=findOneVentaDetalleId(veId);
			_ventaDetalle.setVeDeCantidad(ventaDetalle.getVeDeCantidad());
			_ventaDetalle.setVeDePrecioUnitario(ventaDetalle.getVeDePrecioUnitario());
			_ventaDetalle.setItId(ventaDetalle.getItId());
			_ventaDetalle.setUsId(ventaDetalle.getUsId());
			_ventaDetalle.setUsFechaReg(ventaDetalle.getUsFechaReg());
			this.ventaDetalleDao.update(_ventaDetalle);	
		 }
		 public void DeleteRutaDetalle(int ruId){
			 this.ventaDetalleDao.deleteById(ruId);
		 }
}
