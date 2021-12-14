# Sistema Central Gráfica


**Rafael Duarte Pereira, rafaelduarte1234.2015@gmail.com**
  
**Kleyann Martins Barros, kleyann1@gmail.com**

**Márcio Lucas Machado Pereira, marciolucasmachado22@gmail.com**

**Ian Marcel de Campos Ferreira, ianmarcelcampos@gmail.com**

---

_Curso de Engenharia de Software, Unidade Praça da Liberdade_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**. O trabalho refere-se à matéria TI-3: aplicações em cenários reais e tem como objetivo desenvolver uma aplicação para a gerência de estoque e controle de orçamentos e pedidos. Em reuniões com o proprietário da gráfica foi identificado que não era utilizado nenhum sistema e foi feito o levantamento dos requisitos. A funcionalidade de controle de estoque está com pleno funcionamento._

---


## 1. Introdução

    1.1 Contextualização

Este trabalho realizará a automação de processos de uma gráfica que deverá simplificar os métodos de gerenciaa atualmente utilizados. No sistema desenvolvido será possível realizar a gerência dos orçamentos e pedidos da gráfica e todo o controle de estoque, gerando relátorios de gastos com a manutenção do estoque e dando baixa de modo automático com o uso dos produtos.

    1.2 Problema

Na Central Gráfica toda a listagem do estoque e os cálculos de orçamentos e pedidos são feitos à mão não possuindo nenhum sistema eletrônico que auxilie ou faça as ações de forma automática. Desse modo o trabalho dedicado às essas atividades demandam um tempo maior do que seria necessário para realizá-las

    1.3 Objetivo geral

O principal objetivo a ser alcançado é a automação dos processos de controlar o estoque de produtos e a abertura de novos orçamentos e pedidos

        1.3.1 Objetivos específicos
Os objetivos específicos são:
-  Identificar as necessidades do cliente.
-  Definir as funcionalidades necessárias.
-  Desenvolver um sistema que cumpra as funçoes de forma automatizada.
  
 

    1.4 Justificativas

Como descrito no problema, o atual meio de controle dos serviços da Central Gráfica é feito de modo manual e lento. Devido a isso surgiu a necessidade de um novo método de gerir todos os serviços de modo mais rápido e eficaz.


## 2. Stakeholders

O projeto possui um único stakeholder, o proprietário da gráfica que deseja um sistema capaz de cadastrar novos orçamentos, transformar orçamentos em pedidos e realizar todas a ações de controle de estoque, como adicionar e remover itens do estoque e obter relatórios de gastos referentes ao estoque.


## 3. Proposta da solução

No sistema a ser desenvolvido o usuário deverá ser capaz de gerenciar os novos orçamentos, adicionar e remover itens do estoque, controlar os pedidos exitentes e obter por periodos os gastos realizados com a manutenção do estoque. Desse modo devemos desenvolver um sistema que deixe as informações organizadas, faça os cálculos de forma mais rápida e prática, e assim automatize o controle de estoque e o cálculo de custos da gráfica.

Foram utilizadas reuniões com o cliente e a análise de documentos como técnica de elicitação e foram obtidos os seguintes requisitos:
* Requisitos funcionais:
    -  O administrador deve poder abrir novos orçamento;
    -  O administrador deve poder cancelar orçamento;
    -  O administrador deve poder finalizar orçamento; 
    -  O sistema deve mostrar todos orçamentos cadastrados pelo admistrado; 
    -  O administrador deve poder adicionar produtos ao estoque; 
    -  O administrador deve poder remover produtos do estoque; 
    -  O sistema deve fazer a listagem de todos produtos em estoque;
    -  O sistema deve calcular todos os gastos que será cadastrado pelo adminstrador; 
    -  O sistema deve mostrar uma lista com o detalhamento dos gastos; 
    -  O sistema deve criar pedidos a partir de orçamento;  
    -  O sistema deve mostar o status de todos os pedidos, se foi concluído ou não;

* Requisitos não funcionais
  - O sistema deve ser online;
  - O sistema deve ter uma interface de fácil compreensão para o usuário;
  - O sistema deve utilizar o banco de dados Postgres;



## 4. Projeto da Solução

Para desenvolvimento do projeto nós nos reunimos em um grupo de 4 pessoa e  utilizamos a metologia do Scrum, divido em 6 sprints de duas semanas. Onde dividimos as tarefas de desenvolvimento e documentação e pudemos acompanhar o progresso do trabalho. Durante o desenvolvimento do trabalho utilizamos de diversas ferramentas e tecnologias para concluirmos o trabalho proposto.

E foram uilizadas as seguintes tecnoligias:
  - GitHub para gerencia do codigo, planejamento e documentação;
  - Linguagem MarkDown para documentação;
  - Linguagens HMTL e CSS para desenvolvimento do front-end;
  - Linguagem JavaScript e ferramenta NodeJs para desenvolvimento do back-end;
  - Banco de Postgres para armazenamento dos dados do sistema;
  - Frameworks BootStrap e JQuery;
  - Ferramentas de modelagem Astah e Marvel App;
  - Ferramenta Heroku para hospedagem.

## 5. Artefatos principais

Durante a execução do trabalho foram gerados os seguintes artefatos
- Atas de reunião descrevendo as decisões tomadas nas reuniões com o grupo e com o cliente;
- Documento de visão mostrando o escopo do projeto e os seu respectivos requisitos;
- Diagrama de caso de uso com a demonstração das funcionalidades;
- Documentação de casos de uso descritivos com o detalhamento de cada uma das atividades que pode ser realizada pelo sistema;
- Diagrama de classes para mostar as relações entre as classes do sistema;
- Documentos de interface mostrando e descrevendo como é e o que cada tela do sistema faz.
  
 

    5.1 Diagramas
 

        5.1.1 Diagrama de caso de uso 
     
Foi proposto o seguinte diagrama de caso de uso para descrever as funcionalidades do sistema
![Diagrama de caso de uso](../artefatos/usecases/UseCase%20Diagram0.png)

        5.1.2 Diagrama de classes
        
O sistema consta de cinco classes de negócio para armazenagem e manipulação dos dados que são descritas no digrama abaixo
![Diagrama de classes](../artefatos/Class%20Diagram0.png)

    5.2 Interfaces
 
 Foram propostas interfaces das diversas telas do sistema para interação com o usuário. Estas telas foram desenvolvidas utilizando HTML e o framework Bootstrap e estão dispostas abaixo algumas das principais páginas do sistema:
     
        5.2.1 Página inicial
        
A página inicial do sistema é uma tela simples que contém apenas um menu lateral que permite acessar todas as funcionalidades do sistema
![Pagina inicial](../artefatos/interfaces/leiaute/01-Tela-Inicial.jpeg)

        5.2.1 Página de cadastro de orçamento

A seguinte tela é para o cadastro de novos orçamentos, onde o administrador do sistema preenche os dados do clientes e os prdutos e serviços que o cliente nescessita
![Pagina Novo Orçamento](../artefatos/interfaces/leiaute/05-Novo-orçamento.jpeg)

        5.2.1 Página de listagem de pedidos
        
 Na listagem dos pedidos aparecem todos os pedidos em aberto e que já estão finalizados, de modo que, para os pedidos abertos seja possível visualizar e editar os dados, cancelar e finalizar e, para os pedidos finalizados seja possível visualizar os detalhes
![Pagina Lista Pedidos](../artefatos/interfaces/leiaute/04-Lista-pedidos.jpeg)




  

## 6. Conclusão

Por meio deste trabalho concluimos que para desenvolvermos o sistema, precisamos pesquisar conteúdos extras acerca das tecnologias, por meio de documentações e demais conteúdos disponibilizados em meio eletrônico.

Tivemos como objetivo o desenvolvimento completo de um sistema capaz de gerenciar as demandas de estoque e pedidos de uma gráfica. Nos foi solicitado que o sistema possuisse uma interface simples e de fácil compreensão.

Durante o desenvovimento, nós lidamos com alterações no projeto e nos requisitos e, nosso cliente, ficou muito satisfeito com o que produzimos.

Com isso podemos ter uma experiência de campo de como é o desenvolvimento de sistemas, como funciona a relação com os clientes e como deve ser feita a gerencia do processo de criação. Durante a execução tivemos a oportunidade de colocar em prática a maioria dos conceitos aprendidos nas matérias do curso, mas destacando-se Algoritmos e Estruturas de Dados, Banco de Dados e Desenvolvimento de Interfaces Web. Ao final do trabalho podemos observar que tivemos um grande aprendizado técnico e prático.


# REFERÊNCIAS


# APÊNDICES

**Links:**

[Repositório no github](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2021-2-ti3-6653100-grafica);

Do vídeo de apresentação.



