package com.godared.cuotacolegiado.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Persona implements Serializable {
	@Id 
	@GeneratedValue
	private int PeId;
	private short TiPeId;
	private short TiIdId;
	private String PerNroDocumento;
	private String PeApellido; 
	private String PeNombre;
	private String PeDireccion;
	private String PeTelefono;
	private String PeEmail;
	private String PeRuc; 
	private Boolean PeSexo;
	private Date PeFechaNac;
	private String PeEstadoCivil;
	private String PeNacionalidad;
	private int UsId;
	private Date UsFechaReg;
	
	@JsonProperty("PeId")
	public int getPeId() {
		return PeId;
	}
	public void setPeId(int peId) {
		PeId = peId;
	}
	@JsonProperty("TiPeId")
	public short getTiPeId() {
		return TiPeId;
	}
	public void setTiPeId(short tiPeId) {
		TiPeId = tiPeId;
	}
	@JsonProperty("TiIdId")
	public short getTiIdId() {
		return TiIdId;
	}
	public void setTiIdId(short tiIdId) {
		TiIdId = tiIdId;
	}
	@JsonProperty("PerNroDocumento")
	public String getPerNroDocumento() {
		return PerNroDocumento;
	}
	public void setPerNroDocumento(String perNroDocumento) {
		PerNroDocumento = perNroDocumento;
	}
	@JsonProperty("PeApellido")
	public String getPeApellido() {
		return PeApellido;
	}
	public void setPeApellido(String peApellido) {
		PeApellido = peApellido;
	}
	@JsonProperty("PeNombre")
	public String getPeNombre() {
		return PeNombre;
	}
	public void setPeNombre(String peNombre) {
		PeNombre = peNombre;
	}
	@JsonProperty("PeDireccion")
	public String getPeDireccion() {
		return PeDireccion;
	}
	public void setPeDireccion(String peDireccion) {
		PeDireccion = peDireccion;
	}
	@JsonProperty("PeTelefono")
	public String getPeTelefono() {
		return PeTelefono;
	}
	public void setPeTelefono(String peTelefono) {
		PeTelefono = peTelefono;
	}
	@JsonProperty("PeEmail")
	public String getPeEmail() {
		return PeEmail;
	}
	public void setPeEmail(String peEmail) {
		PeEmail = peEmail;
	}
	@JsonProperty("PeRuc")
	public String getPeRuc() {
		return PeRuc;
	}
	public void setPeRuc(String peRuc) {
		PeRuc = peRuc;
	}
	@JsonProperty("PeSexo")
	public Boolean getPeSexo() {
		return PeSexo;
	}
	public void setPeSexo(Boolean peSexo) {
		PeSexo = peSexo;
	}
	@JsonProperty("PeFechaNac")
	public Date getPeFechaNac() {
		return PeFechaNac;
	}
	public void setPeFechaNac(Date peFechaNac) {
		PeFechaNac = peFechaNac;
	}
	@JsonProperty("PeEstadoCivil")
	public String getPeEstadoCivil() {
		return PeEstadoCivil;
	}
	public void setPeEstadoCivil(String peEstadoCivil) {
		PeEstadoCivil = peEstadoCivil;
	}
	@JsonProperty("PeNacionalidad")
	public String getPeNacionalidad() {
		return PeNacionalidad;
	}
	public void setPeNacionalidad(String peNacionalidad) {
		PeNacionalidad = peNacionalidad;
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
