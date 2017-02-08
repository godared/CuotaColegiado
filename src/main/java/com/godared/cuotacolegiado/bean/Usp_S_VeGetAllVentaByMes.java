package com.godared.cuotacolegiado.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "Usp_S_VeGetAllVentaByMes", 
	procedureName = "Usp_S_VeGetAllVentaByMes",
	resultClasses = Usp_S_VeGetAllVentaByMes.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class,name = "mes")
	})
})
public class Usp_S_VeGetAllVentaByMes implements Serializable{
	@Id
	private int VeId;
	private String PerNroDocumento;
	private String RSocial;
	private String DoCodigo;
	private String NroDoc;
	private float Total;
	
	@JsonProperty("VeId")
	public int getVeId() {
		return VeId;
	}
	@JsonProperty("PerNroDocumento")
	public String getPerNroDocumento() {
		return PerNroDocumento;
	}
	@JsonProperty("RSocial")
	public String getRSocial() {
		return RSocial;
	}
	@JsonProperty("DoCodigo")
	public String getDoCodigo() {
		return DoCodigo;
	}
	@JsonProperty("NroDoc")
	public String getNroDoc() {
		return NroDoc;
	}
	@JsonProperty("Total")
	public float getTotal() {
		return Total;
	}
	
}
