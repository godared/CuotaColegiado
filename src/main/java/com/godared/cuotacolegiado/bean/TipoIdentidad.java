package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipoIdentidad implements Serializable{
	@Id 
	@GeneratedValue
	private int TiIdId;
	private String TiIdCodigo;
	private String TiIdNombre;
	private int UsId;
	private Date UsFechaReg;
	
	@JsonProperty("TiIdId")
	public int getTiIdId() {
		return TiIdId;
	}
	public void setTiIdId(int tiIdId) {
		TiIdId = tiIdId;
	}
	@JsonProperty("TiIdCodigo")
	public String getTiIdCodigo() {
		return TiIdCodigo;
	}
	public void setTiIdCodigo(String tiIdCodigo) {
		TiIdCodigo = tiIdCodigo;
	}
	@JsonProperty("TiIdNombre")
	public String getTiIdNombre() {
		return TiIdNombre;
	}
	public void setTiIdNombre(String tiIdNombre) {
		TiIdNombre = tiIdNombre;
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
