package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Venta implements Serializable{
	
	@Id 
	@GeneratedValue
	private int VeId;
	private short OpId;
	private short DoId;
	private int PeId;
	private Date VeFecha;
	private Date VeFechaVen;
	private String VeSerieDoc;
	private String VeNumeroDoc;
	private float VeValorNoAfecto;
	private float VeValorAfecto;
	private float VeDscto;	
	private float VeIgv;
	private float VeTipoCambio;
	private float VeAnticipo;
	private Boolean VeEstado=false;
	private int MoId;
	private int CaId;
	private int UsId;
	private Date UsFechaReg;
	private String VeTipoOpera;
	private String VeCondicion;
	private String VeMoneda;
	
	@JsonProperty("VeId")
	public int getVeId() {
		return VeId;
	}
	public void setVeId(short veId) {
		VeId = veId;
	}
	@JsonProperty("OpId")
	public short getOpId() {
		return OpId;
	}
	public void setOpId(short opId) {
		OpId = opId;
	}
	@JsonProperty("DoId")
	public short getDoId() {
		return DoId;
	}
	public void setDoId(short doId) {
		DoId = doId;
	}
	@JsonProperty("PeId")
	public int getPeId() {
		return PeId;
	}
	public void setPeId(int peId) {
		PeId = peId;
	}
	@JsonProperty("VeFecha")
	public Date getVeFecha() {
		return VeFecha;
	}
	public void setVeFecha(Date veFecha) {
		VeFecha = veFecha;
	}
	@JsonProperty("VeFechaVen")
	public Date getVeFechaVen() {
		return VeFechaVen;
	}
	public void setVeFechaVen(Date veFechaVen) {
		VeFechaVen = veFechaVen;
	}
	@JsonProperty("VeSerieDoc")
	public String getVeSerieDoc() {
		return VeSerieDoc;
	}
	public void setVeSerieDoc(String veSerieDoc) {
		VeSerieDoc = veSerieDoc;
	}
	@JsonProperty("VeNumeroDoc")
	public String getVeNumeroDoc() {
		return VeNumeroDoc;
	}
	public void setVeNumeroDoc(String veNumeroDoc) {
		VeNumeroDoc = veNumeroDoc;
	}
	@JsonProperty("VeValorNoAfecto")
	public float getVeValorNoAfecto() {
		return VeValorNoAfecto;
	}
	public void setVeValorNoAfecto(float veValorNoAfecto) {
		VeValorNoAfecto = veValorNoAfecto;
	}
	@JsonProperty("VeValorAfecto")
	public float getVeValorAfecto() {
		return VeValorAfecto;
	}
	public void setVeValorAfecto(float veValorAfecto) {
		VeValorAfecto = veValorAfecto;
	}
	@JsonProperty("VeDscto")
	public float getVeDscto() {
		return VeDscto;
	}
	public void setVeDscto(float veDscto) {
		VeDscto = veDscto;
	}
	@JsonProperty("VeIgv")
	public float getVeIgv() {
		return VeIgv;
	}
	public void setVeIgv(float veIgv) {
		VeIgv = veIgv;
	}
	@JsonProperty("VeTipoCambio")
	public float getVeTipoCambio() {
		return VeTipoCambio;
	}
	public void setVeTipoCambio(float veTipoCambio) {
		VeTipoCambio = veTipoCambio;
	}
	@JsonProperty("VeAnticipo")
	public float getVeAnticipo() {
		return VeAnticipo;
	}
	public void setVeAnticipo(float veAnticipo) {
		VeAnticipo = veAnticipo;
	}
	@JsonProperty("VeEstado")
	public Boolean getVeEstado() {
		return VeEstado;
	}
	public void setVeEstado(Boolean veEstado) {
		VeEstado = veEstado;
	}
	@JsonProperty("MoId")
	public int getMoId() {
		return MoId;
	}
	public void setMoId(int moId) {
		MoId = moId;
	}
	@JsonProperty("CaId")
	public int getCaId() {
		return CaId;
	}
	public void setCaId(int caId) {
		CaId = caId;
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
	@JsonProperty("VeTipoOpera")
	public String getVeTipoOpera() {
		return VeTipoOpera;
	}
	public void setVeTipoOpera(String veTipoOpera) {
		VeTipoOpera = veTipoOpera;
	}
	@JsonProperty("VeCondicion")
	public String getVeCondicion() {
		return VeCondicion;
	}
	public void setVeCondicion(String veCondicion) {
		VeCondicion = veCondicion;
	}
	@JsonProperty("VeMoneda")
	public String getVeMoneda() {
		return VeMoneda;
	}
	public void setVeMoneda(String veMoneda) {
		VeMoneda = veMoneda;
	}


}
