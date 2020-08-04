package com.example.springboot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

public class Endereco{
   
	@JsonIgnoreProperties(ignoreUnknown = true)
	String bairro;	
	String cep;
	String cidade;
	String codigoIbge;	
	String complemento;	
	float latitude;
	float longitude;	
	String numero;	
	String pais;	
	String rua;	
	String uf;

	public String getBairro	() {
		return this.bairro	;
	}

	public void setBairro	(String bairro	) {
		this.bairro	 = bairro	;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCodigoIbge	() {
		return this.codigoIbge	;
	}

	public void setCodigoIbge	(String codigoIbge	) {
		this.codigoIbge	 = codigoIbge	;
	}

	public float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude	() {
		return this.longitude	;
	}

	public void setLongitude	(float longitude	) {
		this.longitude	 = longitude	;
	}

	public String getComplemento	() {
		return this.complemento	;
	}

	public void setComplemento	(String complemento	) {
		this.complemento	 = complemento	;
	}

	public String getNumero	() {
		return this.numero	;
	}

	public void setNumero	(String numero	) {
		this.numero	 = numero	;
	}

	public String getPais	() {
		return this.pais	;
	}

	public void setPais	(String pais	) {
		this.pais	 = pais	;
	}

	public String getRua	() {
		return this.rua	;
	}

	public void setRua	(String rua	) {
		this.rua	 = rua	;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

    
}
