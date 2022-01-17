# senseDataAutom2
## Saucedemo Automação
Repositório que contém a automação de testes da Interface web da saucedemo.
Essa automação é relativa ao desafio técnico, etapa de um processo seletivo realizado em Janeiro de 2022.
Os Sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

 - Java 
 - Junit 
 - Selenium 
 - WebDriver 
 - Maven

## Testes Automatizados
Testes para simular uma sessão de compras no site sucedemo.com

## Notas Gerais

 - Page Objects foi utilizado como Design Pattern para estruturar o
   projeto.
   
 - As anotações Before Each e After Each são utilizadas para
 respectivamente abrir e fechar o navegador no início e no fim do
 teste.

Nesse projeto foi utilizado o Junit 5, possibilitando o uso da anotação Displayname 
para dar descrições em português aos testes.


## Instruções

 - Baixe o projeto e a partir da IDE de sua preferência execute a classe
   ComprasTest.java
   
 - Caso queira que o navegador não seja fechado ao fim dos testes, por
 favor comente a anotação AfterEach e o proprio método afterEach a
 partir da linha 47 da classe comprasTest, ficando conforme abaixo:

//@AfterEach
//public void afterEach(){
//Fechando o navegador
//navegador.quit();
