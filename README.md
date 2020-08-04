# Teste Demacode

Oi! sou a Geovana, e finalmente aqui está o meu **projeto final** para a vaga de desenvolvedora Back-End na Demacode.

# O que foi desenvolvido:

A aplicação busca informações em uma lista de dados de um webservice e as envia para um outro webservice.


## O que foi utilizado:
- O código foi feito na linguagem Java, com o framework Springboot.
- Foi feito o deploy do código em uma [instância na AWS](ec2-3-17-61-16.us-east-2.compute.amazonaws.com). 
	>Como a aplicação é executada no terminal da Máquina Virtual, e esse não é possível acessar através do link, deixo ao final do README um gif que comprova o deploy realizado.

## Informações sobre o código:

- A integração dos webservices é feita na classe HelloController.java, é preciso acessar pelo localhost o caminho /ObjectOperations para que as chamadas de acesso aos webServices sejam feitas.
	>1º compile a aplicação;
	2º no localhost da máquina em questão, acesse: localhost:8080/ObjectOperations;
	3º volte ao terminal, lá ele exibirá os dados que vieram do get, juntamente com a classe PedidoEnvio transformada em JSON pronta para ser enviada ao webservice destino. - o "null" que é exibido no final é o retorno do método postForObject após ter encaminhado os dados.
- A Classe PedidoEnvio.java contém apenas os dados que precisam ser enviados ao webservice destino.
- Embora venham vários pedidos do webservce origem, eles são postados individualmente no webservice destino. 
- Devido o  tamanho do arquivo .jar dessa aplicação ser muito grande, ele está disponível [nesse link](https://demacode.s3.us-east-2.amazonaws.com/spring-boot-0.0.1-SNAPSHOT.jar).

## GIF comprovando o deploy
![](https://github.com/geovanamenezes/GIFs-for-README/blob/master/aws.gif?raw=true)
Aba da esquerda: localhost da instância criada na AWS.
Aba da direita: terminal da instância criada.

Obrigada pela oportunidade ;)
