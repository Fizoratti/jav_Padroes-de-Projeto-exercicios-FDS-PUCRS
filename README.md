
# Branches
1. Abstract Factory
- [x] exercicio1.1
- [ ] exercicio1.2
2. Builder
- [ ] exercicio2.1
- [ ] exercicio2.2
3. Factory Method
- [ ] exercicio3.1
- [ ] exercicio3.2
- [ ] exercicio3.3
4. Singleton
- [ ] exercicio4.1

# Enunciados
## 1. Abstract Factory
### 1.1.Exercício:
Crie um “Hello, World” que utilize o padrão Abstract Factory para escolher dentre duas formas de impressão: (a) na tela ou (b) num arquivo chamado output.txt. Seu programa deve escolher dentre as duas fábricas aleatoriamente.

### 1.2.Exercício:
Considere os seguintes conceitos do mundo real: pizzaria, pizzaiolo, pizza, consumidor. Considere ainda que em uma determinada pizzaria, dois pizzaiolos se alternam. Um deles trabalha segundas, quartas e sextas e só sabe fazer pizza de calabresa (queijo + calabresa + tomate), o outro trabalha terças, quintas e sábados e só sabe fazer pizza de presunto (queijo + presunto + tomate). A pizzaria fecha aos domingos.
Tente mapear os conceitos acima para o padrão Abstract Factory (hierarquia de fábricas, hierarquia de produtos, cliente) e implemente um programa que receba uma data como parâmetro (formato dd/mm/yyyy) e imprima os ingredientes da pizza que é feita no dia ou, se a pizzaria estiver fechada, informe isso na tela.
Agora imagine que a pizzaria agora faz também calzones (novamente, de calabresa ou presunto).
Complemente a solução com mais este componente.

## 2. Builder
### 2.1.Exercício:
Na cadeia de restaurantes fast-food PatternBurgers há um padrão para montagem de lanches de crianças. O sanduíche (hambúrguer ou cheeseburger), a batata (pequena, média ou grande) e o brinquedo (carrinho ou bonequinha) são colocados dentro de uma caixa e o refrigerante (coca ou guaraná) é entregue fora da caixa. A classe abaixo é dada para representar o pedido de um consumidor:
```java
import java.util.*;
public class Pedido {
private Set<String> dentroDaCaixa = new HashSet<String>();
private Set<String> foraDaCaixa = new HashSet<String>();
public void adicionarDentroDaCaixa(String item) {
dentroDaCaixa.add(item);
}
public void adicionarForaDaCaixa(String item) {
foraDaCaixa.add(item);
}
public String toString() {
StringBuffer buffer = new StringBuffer();
buffer.append("Seu pedido:\n");
buffer.append("Dentro da caixa:\n");
for (String item : dentroDaCaixa) buffer.append("\t" + item + "\n");
buffer.append("Fora da caixa:\n");
for (String item : foraDa
```

### 2.2.Exercício:
Escreva classes para satisfazer os seguintes papéis do padrão Builder:
* Client: recebe como parâmetros o nome, endereço, telefone e e-mail de uma pessoa, solicita ao director que construa informações de contato, recupera a informação do builder e imprime;
* Director: recebe como parâmetro o builder a ser utilizado e os dados de contato. Manda o builder construir o contato;
* Builder: constrói o contato. Existem três tipos de contato e um builder para cada tipo:
    * ContatoInternet: armazena nome e e-mail;
    * ContatoTelefone: armazena nome e telefone;
    * ContatoCompleto: armazena nome, endereço, telefone e e-mail.
A classe que representa o papel client deve ter o método main() que irá criar um director e um builder de cada tipo. Em seguida, deve pedir ao director que crie um contato de cada tipo e imprimi-los (use o toString() da classe que representa a informação de contato).

## 3. Factory Method
### 3.1.Exercício:
Construa um programa que receba como parâmetro um ou mais nomes, cada um podendo estar em um dos
seguintes formatos:
* "nome sobrenome";
* "sobrenome, nome".
Escreva duas aplicações de construção de nomes, uma para cada formato. Cada uma deve ser responsável
por armazenar os nomes criados e imprimi-los quando requisitado. Implemente o padrão Factory Method de
forma que somente a criação do nome seja delegada às aplicações concretas (subclasses). Seu programa
deve criar as duas aplicações e construir objetos da classe Nome, que deve ter propriedades nome e
sobrenome para armazenar as informações em separado. Os nomes não precisam ser impressos em ordem.
Ex.:
```
$ java Nomes "McNealy, Scott" "James Gosling" "Naughton, Patrick"
James Gosling
Scott McNealy
Patrick Naughton
```

### 3.2.Exercício:
Crie dois arquivos texto em um diretório qualquer:
publico.txt | confidencial.txt
----------- | -----------
```Estas são informações públicas sobre qualquer coisa. Todo mundo pode ver este arquivo.``` | ```Estas são informações confidenciais, o que significa que você provavelmente sabe a palavra secreta!```

Usando o padrão Factory Method, crie duas provedoras de informação: uma que retorna informações
públicas e outra que retorna informações confidenciais. Utilize o provedor confidencial se o usuário informar
a senha “designpatterns” como parâmetro para o programa, que deve recuperar a informação e exibi-la
na tela.

### 3.3.Exercício:
Escreva um programa que conte até 10 e envie os números para uma ferramenta de log. Esta ferramenta de
log deve ser construída por uma fábrica. Utilize Factory Method para permitir a escolha entre dois tipos de
log: em arquivo (log.txt) ou diretamente no console. A escolha deve ser por um parâmetro passado ao
programa (“arquivo” ou “console”).

## 4. Singleton
### 4.1.Exercício:
Escreva, compile e execute o programa abaixo. Em seguida, troque sua implementação para que a classe
Incremental seja Singleton. Execute novamente e veja os resultados.
```java
class Incremental {
private static int count = 0;
private int numero;
public Incremental() {
numero = ++count;
}
public String toString() {
return "Incremental " + numero;
}
}
public class TesteIncremental {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
Incremental inc = new Incremental();
System.out.println(inc);
}
}
}
```

 ## Enunciado - 09/04

O dono de uma rede de bares da cidade nos encomendou um sistema em Java para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar,  cliente informe seu nome, CPF, idade e gênero. Alguns dos clientes pode ser sócios do bar e elegíveis a um programa de milhagens. Neste caso, deve-se registrar também o número do sócio.

A qualquer momento, ele deseja ser capaz de consultar quem são as pessoas que estão no bar, se alguém com um determinado CPF está no bar, quantas são as pessoas e qual a distribuição por gênero (percentual de clientes masculinos e femininos) e por status de sócio (quantos são sócios, e quantos não são). Ao sair, o cliente deve informar seu CPF, para registrar sua saída.

Ao final do dia, os dados de todos os clientes que estiveram no bar devem estar armazenados em arquivo texto.

- Modele este sistema (defina classes, com seus atributos e métodos), implemente-o e implemente os casos de testes usando testes unitários/mocks necessários.

## Enunciado Padrões de Projeto Creacionais - 16/04

1. Faça os exercícios 1.1 e 1.2 dos enunciado disponibilizado no moodle

2. Altere sua solução do sistema de acesso ao bar (enunciado acima) para utilizar os padrões creacionais vistos (em particular, abstract factory).

## Enunciado Final - Padrões de Projeto Creacionais - 18/04, 23/04 e 25/04

1. Faça os exercícios dos enunciado disponibilizado no moodle

2. Altere sua solução do sistema de acesso ao bar (enunciado abaixo) para utilizar os padrões creacionais vistos (em particular, abstract factory).

3. Faça a entrega da implementação dos exercícios da lista, disponibilizados no moodle, sobre Padrões de Projeto Creacionais.

Data de Entrega: 17/05, até 23:55, no moodle, individual ou em grupos de até 3 pessoas;
um arquivo .zip, com todas a implementações da lista, com o nome dos membros da equipe.
