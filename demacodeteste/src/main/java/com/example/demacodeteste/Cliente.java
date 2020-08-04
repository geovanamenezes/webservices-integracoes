package com.example.springboot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Cliente{
   
//@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
String cpfCnpj;
String email;
Endereco endereco;
String nome;
String telefone;

	public String getCpfCnpj() {
		return this.cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



}
