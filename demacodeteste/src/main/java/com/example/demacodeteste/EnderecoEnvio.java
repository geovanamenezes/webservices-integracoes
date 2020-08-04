package com.example.springboot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

public class EnderecoEnvio{
    @JsonIgnoreProperties(ignoreUnknown = true)
    String bairro;	
    String cidade;
    String complemento;	
    String logradouro;	
    String numero;	
    String pais;	
    String uf;

	public String getBairro(){
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro	 = bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return this.complemento	;
	}

	public void setComplemento(String complemento) {
		this.complemento= complemento	;
	}

	public String getLogradouro	() {
		return this.logradouro	;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro	 = logradouro	;
	}

	public String getNumero	() {
		return this.numero	;
	}

	public void setNumero(String numero	) {
		this.numero	 = numero	;
	}

	public String getPais() {
		return this.pais	;
	}

	public void setPais	(String pais) {
		this.pais= pais	;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}