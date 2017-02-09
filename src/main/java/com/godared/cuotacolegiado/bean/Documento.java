package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Documento implements Serializable{
	@Id 
	@GeneratedValue
	private int DoId;
	private String DoCodigo;
	private String DoDescripcion;
	private String DoCodigoSunat;
	private String DoSerie;
	private Integer DoNumero; 
	private short DoOrigen;
	private Boolean DoActivo;
	private int UsId;
	private Date UsFechaReg;
	
	@JsonProperty("DoId")
	public int getDoId() {
		return DoId;
	}
	public void setDoId(int doId) {
		DoId = doId;
	}
	@JsonProperty("DoCodigo")
	public String getDoCodigo() {
		return DoCodigo;
	}
	public void setDoCodigo(String doCodigo) {
		DoCodigo = doCodigo;
	}
	@JsonProperty("DoDescripcion")
	public String getDoDescripcion() {
		return DoDescripcion;
	}
	public void setDoDescripcion(String doDescripcion) {
		DoDescripcion = doDescripcion;
	}
	@JsonProperty("DoCodigoSunat")
	public String getDoCodigoSunat() {
		return DoCodigoSunat;
	}
	public void setDoCodigoSunat(String doCodigoSunat) {
		DoCodigoSunat = doCodigoSunat;
	}
	@JsonProperty("DoSerie")
	public String getDoSerie() {
		return DoSerie;
	}
	public void setDoSerie(String doSerie) {
		DoSerie = doSerie;
	}
	@JsonProperty("DoNumero")
	public Integer getDoNumero() {
		return DoNumero;
	}
	public void setDoNumero(Integer doNumero) {
		DoNumero = doNumero;
	}
	@JsonProperty("DoOrigen")
	public short getDoOrigen() {
		return DoOrigen;
	}
	public void setDoOrigen(short doOrigen) {
		DoOrigen = doOrigen;
	}
	@JsonProperty("DoActivo")
	public Boolean getDoActivo() {
		return DoActivo;
	}
	public void setDoActivo(Boolean doActivo) {
		DoActivo = doActivo;
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
