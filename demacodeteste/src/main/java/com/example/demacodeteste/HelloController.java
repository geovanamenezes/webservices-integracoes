package com.example.springboot;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import javax.ws.rs.Path;
import com.google.gson.Gson; 
import com.google.gson.JsonObject; 
import org.json.JSONObject;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray; 
import com.fasterxml.jackson.databind.JsonNode;
import java.net.URI;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import java.io.*;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Teste Demacode!";
	}

	//Método que faz a integração dos WebServices
	@RequestMapping("/ObjectOperations")
	public String integracoes(){
	   
		String result;
		Gson gson = new Gson();
		String arrJson;
		RestTemplate restTemplate = new RestTemplate();						
		
		//VARIÁVEIS QUE SERÃO UTILIZADAS NO POST
		HttpHeaders headers = new HttpHeaders();
		String urlDestino = "http://destino.demacode.com.br:8282/v1/pedido";
		String pedidoPost;
		String pedidoResultAsJson;
		Pedido[] arrayPedidos;
		List<PedidoEnvio> listaPedidos = new ArrayList<>();
		
			try {
				//array que recebe os dados e já lança os dados para as classes do model
				arrayPedidos = restTemplate.getForObject("http://origem.demacode.com.br:8181/WS/Pedido?data_inicial=2020-07-07T01:01&data_final=2020-01-01T01:01", Pedido[].class);
				//se houverem dados, executa:
                System.out.println("Quantidade Pedidos = " + arrayPedidos.length);
				if(arrayPedidos != null){
					for( int i=0; i < arrayPedidos.length; i++){
						// Atribuindo na classe PedidoEnvio apenas os valores que precisam ser postados no webservice destino
						PedidoEnvio p = new PedidoEnvio();
						System.out.println();
						System.out.println("-----------------------------------------------------");
                        System.out.println("Pedido: " + arrayPedidos[i].numero);
                        System.out.println("Cliente: " + arrayPedidos[i].cliente.cpfCnpj);
						p.setCpfCnpjCliente(arrayPedidos[i].cliente.cpfCnpj);
                        System.out.println("Representante: " + arrayPedidos[i].representante.cpfCnpj);
						p.setCpfCnpjRepresentante(arrayPedidos[i].representante.cpfCnpj);
                        System.out.println("Endereco de entrega: ");
						p.setEnderecoEntrega(arrayPedidos[i].cliente.endereco);
                        System.out.println("Produtos: ");
						p.setProdutos(arrayPedidos[i].itens);
						p.setNumero(arrayPedidos[i].numero);
                        System.out.println("Desconto: " + arrayPedidos[i].valorDesconto);
						p.setValorDesconto(arrayPedidos[i].valorDesconto);
                        System.out.println("Frete: " + arrayPedidos[i].valorFrete);
						p.setValorFrete(arrayPedidos[i].valorFrete);
							
						float total = 0.00f;
						
						for(int j=0; j < arrayPedidos[i].itens.length; j++ ){
							//Total dos pedidos vai sendo somado
							total = total + arrayPedidos[i].itens[j].valorTotal;
						}
						
                        System.out.println("Valor Total: " + total);
						p.setValorTotal(total);
						listaPedidos.add(p);

						//valor total do pedidoEnvio será a soma dos valores dos itens	
						headers.setContentType(MediaType.APPLICATION_JSON);	
						JSONObject pedidoJsonObject = new JSONObject(p);
						System.out.println("__________________________________________________");
						System.out.println("DADOS EM FORMATO JSON");
						System.out.println(pedidoJsonObject);
						System.out.println("__________________________________________________");
						HttpEntity<String> request = new HttpEntity<String>(pedidoJsonObject.toString(), headers);
						pedidoResultAsJson = restTemplate.postForObject(urlDestino, request, String.class);
						System.out.println(pedidoResultAsJson);
					}
				}

			} catch (Exception e) {
					return e.toString();
			}

		return "GET e POST realizados!";
	}

	
}

	
