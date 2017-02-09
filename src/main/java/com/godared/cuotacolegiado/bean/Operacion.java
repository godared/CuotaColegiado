package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Operacion implements Serializable{
	@Id 
	@GeneratedValue
	private short OpId;
	private String OpNombre;
	private int UsId;
	private Date UsFechaReg;
	
	@JsonProperty("OpId")
	public short getOpId() {
		return OpId;
	}
	public void setOpId(short opId) {
		OpId = opId;
	}
	@JsonProperty("OpNombre")
	public String getOpNombre() {
		return OpNombre;
	}
	public void setOpNombre(String opNombre) {
		OpNombre = opNombre;
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
