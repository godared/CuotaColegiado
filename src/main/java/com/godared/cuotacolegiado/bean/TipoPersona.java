package com.godared.cuotacolegiado.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class TipoPersona implements Serializable {
	@Id 
	@GeneratedValue
	private int TiPeId;
	private String TiPeCodigo;
	private String TiPeNombre;
	
	@JsonProperty("TiPeId")
	public int getTiPeId() {
		return TiPeId;
	}
	public void setTiPeId(int tiPeId) {
		TiPeId = tiPeId;
	}
	@JsonProperty("TiPeCodigo")
	public String getTiPeCodigo() {
		return TiPeCodigo;
	}
	public void setTiPeCodigo(String tiPeCodigo) {
		TiPeCodigo = tiPeCodigo;
	}
	@JsonProperty("TiPeNombre")
	public String getTiPeNombre() {
		return TiPeNombre;
	}
	public void setTiPeNombre(String tiPeNombre) {
		TiPeNombre = tiPeNombre;
	}
	
}
