package com.godared.cuotacolegiado.service;

import java.util.List;

import com.godared.cuotacolegiado.bean.Documento;
import com.godared.cuotacolegiado.bean.Operacion;
import com.godared.cuotacolegiado.bean.Usp_S_VeGetAllVentaByMes;
import com.godared.cuotacolegiado.bean.Venta;
import com.godared.cuotacolegiado.bean.VentaDetalle;

public interface IVentaService {
	
	 List<Venta> findAll();
	 Venta findOne(int veId);
	 void Delete(int veId);
	 void Save(Venta venta,List<VentaDetalle> ventaDetalle);
	 List<Usp_S_VeGetAllVentaByMes> GetAllVentaByMes(int mes);
	 //Ruta Detalle
	 VentaDetalle findOneVentaDetalleId(int veId);
	 VentaDetalle findOneVentaDetalleByVeId(int veId);
	 void CreateVentaDetalle(VentaDetalle ventaDetalle);
	 void UpdateVentaDetalle(int veId,VentaDetalle ventaDetalle);
	 void DeleteVentaDetalle(int veId);
	 //Documento
	 List<Documento> findAllDocumento();
	 Documento findOneDocumento(int doId);
	 void deleteByIdDocumento(int doId);
	 void createDocumento(Documento entity);
	 Documento updateDocumento(Documento entity);
	//Operacion
	 List<Operacion> findAllOperacion();
	 Operacion findOneOperacion(int doId);
	 void deleteByIdOperacion(int doId);
	 void createOperacion(Operacion entity);
	 Operacion updateOperacion(Operacion entity);
}
