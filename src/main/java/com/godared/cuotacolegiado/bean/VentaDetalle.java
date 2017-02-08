package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class VentaDetalle implements Serializable{
	@Id
	private int VeId;
	private int ItId;
	private float VeDeCantidad;
	private float VeDePrecioUnitario;
	private int UsId;
	private Date UsFechaReg;
	
	@JsonProperty("VeId")
	public int getVeId() {
		return VeId;
	}
	public void setVeId(int veId) {
		VeId = veId;
	}
	@JsonProperty("ItId")
	public int getItId() {
		return ItId;
	}
	public void setItId(int itId) {
		ItId = itId;
	}
	@JsonProperty("VeDeCantidad")
	public float getVeDeCantidad() {
		return VeDeCantidad;
	}
	public void setVeDeCantidad(float veDeCantidad) {
		VeDeCantidad = veDeCantidad;
	}
	@JsonProperty("VeDePrecioUnitario")
	public float getVeDePrecioUnitario() {
		return VeDePrecioUnitario;
	}
	public void setVeDePrecioUnitario(float veDePrecioUnitario) {
		VeDePrecioUnitario = veDePrecioUnitario;
	}
	@JsonProperty("UsId")
	public int getUsId() {
		return UsId;
	}
	public void setUsId(int usId) {
		UsId = usId;
	}
	@JsonProperty("UsFechaReg")
	public Date getUsFechaReg() {
		return UsFechaReg;
	}
	public void setUsFechaReg(Date usFechaReg) {
		UsFechaReg = usFechaReg;
	}
	
}
