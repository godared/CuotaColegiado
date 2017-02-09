package com.godared.cuotacolegiado.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "Usp_S_PeGetAllPersonaByTermino", 
	procedureName = "Usp_S_PeGetAllPersonaByTermino",
	resultClasses = Usp_S_PeGetAllPersonaByTermino.class , 
	parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class,name = "termino"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class,name = "tiPe")
	})
})
public class Usp_S_PeGetAllPersonaByTermino implements Serializable{
	@Id
	private int PeId;
	private String PerNroDocumento;
	private String Nombres;
	private String TiPeNombre;
	
	@JsonProperty("PeId")
	public int getPeId() {
		return PeId;
	}

	@JsonProperty("PerNroDocumento")
	public String getPerNroDocumento() {
		return PerNroDocumento;
	}
	@JsonProperty("Nombres")
	public String getNombres() {
		return Nombres;
	}
	@JsonProperty("TiPeNombre")
	public String getTiPeNombre() {
		return TiPeNombre;
	}	

}
