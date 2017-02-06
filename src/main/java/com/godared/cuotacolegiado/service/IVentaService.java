package com.godared.cuotacolegiado.service;

import java.util.List;

import com.godared.cuotacolegiado.bean.Venta;
import com.godared.cuotacolegiado.bean.VentaDetalle;

public interface IVentaService {
	
	 List<Venta> findAll();
	 Venta findOne(int veId);
	 void Delete(int veId);
	 void Save(Venta venta,List<VentaDetalle> ventaDetalle);
	 //Ruta Detalle
	 VentaDetalle findOneVentaDetalleId(int veId);
	 VentaDetalle findOneVentaDetalleByVeId(int veId);
	 void CreateVentaDetalle(VentaDetalle ventaDetalle);
	 void UpdateVentaDetalle(int veId,VentaDetalle ventaDetalle);
	 void DeleteVentaDetalle(int veId);
}
