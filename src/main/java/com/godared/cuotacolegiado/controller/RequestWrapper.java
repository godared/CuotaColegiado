package com.godared.cuotacolegiado.controller;

import java.util.List;

import com.godared.cuotacolegiado.bean.Venta;
import com.godared.cuotacolegiado.bean.VentaDetalle;

public class RequestWrapper {
	Venta venta;
	List<VentaDetalle> ventaDetalle;
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public List<VentaDetalle> getVentaDetalle() {
		return ventaDetalle;
	}
	public void setVentaDetalle(List<VentaDetalle> ventaDetalle) {
		this.ventaDetalle = ventaDetalle;
	}
	
	
}
