package com.example.springboot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class Pedido{
   
	@JsonIgnoreProperties(ignoreUnknown = true)
	public String numero;
	public String data;
	public String hora;
	float valorFrete;
	float valorDesconto;
	public Representante representante;
	public Cliente cliente;
	public Item[] itens;


	public Item[] getItens() {
		return this.itens;
	}

	public void setItens(Item[] itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Representante getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	public float getValorDesconto() {
		return this.valorDesconto;
	}

	public void setValorDesconto(float valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public float getValorFrete() {
		return this.valorFrete;
	}

	public void setValorFrete(float valorFrete) {
		this.valorFrete = valorFrete;
	}

}
