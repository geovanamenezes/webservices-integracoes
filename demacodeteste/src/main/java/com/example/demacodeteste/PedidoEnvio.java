package com.example.springboot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;


public class PedidoEnvio{
   
	@JsonIgnoreProperties(ignoreUnknown = true)
	String cpfCnpjCliente;
	String cpfCnpjRepresentante;
	EnderecoEnvio enderecoEntrega;
	String numero;
	Produto[] produtos;
	float valorDesconto;
	float valorFrete;
	float valorTotal;

    public PedidoEnvio() {
        this.enderecoEntrega = new EnderecoEnvio();
    }
	//getters and setters
	public Produto[] getProdutos() {
		return this.produtos;
	}

	public void setProdutos(Item[] produtos) {
		
		this.produtos= new Produto[produtos.length];
		if (produtos != null){
			for(int i = 0; i < produtos.length; i++){
                System.out.println("Produto["+i+"]");
                this.produtos[i] = new Produto();
                System.out.println("Codigo = "+ produtos[i].codigo + " Preco = " + produtos[i].preco+" Quantidade=" + produtos[i].quantidade + " Total = " + produtos[i].valorTotal);
				this.produtos[i].precoUnitario = produtos[i].preco;
				this.produtos[i].quantidade = produtos[i].quantidade;
				this.produtos[i].sku = produtos[i].codigo;
				this.produtos[i].valorTotal = produtos[i].valorTotal;
			}
		}
			
	}

	public EnderecoEnvio getEnderecoEntrega() {
		return this.enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
        System.out.println("Bairro = "+enderecoEntrega.bairro);
		this.enderecoEntrega.bairro = enderecoEntrega.bairro;
        System.out.println("Cidade = " + enderecoEntrega.cidade);
		this.enderecoEntrega.cidade = enderecoEntrega.cidade;
        System.out.println("Complemento = " + enderecoEntrega.complemento);
		this.enderecoEntrega.complemento = enderecoEntrega.complemento;
        System.out.println("Logradouro = " + enderecoEntrega.rua);
		this.enderecoEntrega.logradouro = enderecoEntrega.rua;
        System.out.println("Numero = " + enderecoEntrega.numero);
		this.enderecoEntrega.numero = enderecoEntrega.numero;
        System.out.println("pais = " + enderecoEntrega.pais);
		this.enderecoEntrega.pais = enderecoEntrega.pais;
        System.out.println("UF = " + enderecoEntrega.uf);
		this.enderecoEntrega.uf = enderecoEntrega.uf;

	}

	public String getCpfCnpjCliente() {
		return this.cpfCnpjCliente;
	}

	public void setCpfCnpjCliente(String cpfCnpjCliente) {
		this.cpfCnpjCliente = cpfCnpjCliente;
	}

	public String getCpfCnpjRepresentante() {
		return this.cpfCnpjRepresentante;
	}

	public void setCpfCnpjRepresentante(String cpfCnpjRepresentante) {
		this.cpfCnpjRepresentante = cpfCnpjRepresentante;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public float getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

}
