# Sistema Central Gr�fica


**Rafael Duarte Pereira, rafaelduarte1234.2015@gmail.com**
  
**Kleyann Martins Barros, kleyann1@gmail.com**

**M�rcio Lucas Machado Pereira, marciolucasmachado22@gmail.com**

**Ian Marcel de Campos Ferreira, ianmarcelcampos@gmail.com**

---

_Curso de Engenharia de Software, Unidade Pra�a da Liberdade_

_Instituto de Inform�tica e Ci�ncias Exatas � Pontif�cia Universidade Cat�lica de Minas Gerais (PUC MINAS), Belo Horizonte � MG � Brasil_

---

_**Resumo**. O trabalho refere-se � mat�ria TI-3: aplica��es em cen�rios reais e tem como objetivo desenvolver uma aplica��o para a ger�ncia de estoque e controle de or�amentos e pedidos. Em reuni�es com o propriet�rio da gr�fica foi identificado que n�o era utilizado nenhum sistema e foi feito o levantamento dos requisitos. A funcionalidade de controle de estoque est� com pleno funcionamento._

---


## 1. Introdu��o

    1.1 Contextualiza��o

Este trabalho realizar� a automa��o de processos de uma gr�fica que dever� simplificar os m�todos de gerenciaa atualmente utilizados. No sistema desenvolvido ser� poss�vel realizar a ger�ncia dos or�amentos e pedidos da gr�fica e todo o controle de estoque, gerando rel�torios de gastos com a manuten��o do estoque e dando baixa de modo autom�tico com o uso dos produtos.

    1.2 Problema

Na Central Gr�fica toda a listagem do estoque e os c�lculos de or�amentos e pedidos s�o feitos � m�o n�o possuindo nenhum sistema eletr�nico que auxilie ou fa�a as a��es de forma autom�tica. Desse modo o trabalho dedicado �s essas atividades demandam um tempo maior do que seria necess�rio para realiz�-las

    1.3 Objetivo geral

O principal objetivo a ser alcan�ado � a automa��o dos processos de controlar o estoque de produtos e a abertura de novos or�amentos e pedidos

        1.3.1 Objetivos espec�ficos
Os objetivos espec�ficos s�o:
-  Identificar as necessidades do cliente.
-  Definir as funcionalidades necess�rias.
-  Desenvolver um sistema que cumpra as fun�oes de forma automatizada.
  
�

    1.4 Justificativas

Como descrito no problema, o atual meio de controle dos servi�os da Central Gr�fica � feito de modo manual e lento. Devido a isso surgiu a necessidade de um novo m�todo de gerir todos os servi�os de modo mais r�pido e eficaz.


## 2. Stakeholders

O projeto possui um �nico stakeholder, o propriet�rio da gr�fica que deseja um sistema capaz de cadastrar novos or�amentos, transformar or�amentos em pedidos e realizar todas a a��es de controle de estoque, como adicionar e remover itens do estoque e obter relat�rios de gastos referentes ao estoque.


## 3. Proposta da solu��o

No sistema a ser desenvolvido o usu�rio dever� ser capaz de gerenciar os novos or�amentos, adicionar e remover itens do estoque, controlar os pedidos exitentes e obter por periodos os gastos realizados com a manuten��o do estoque. Desse modo devemos desenvolver um sistema que deixe as informa��es organizadas, fa�a os c�lculos de forma mais r�pida e pr�tica, e assim automatize o controle de estoque e o c�lculo de custos da gr�fica.

Foram utilizadas reuni�es com o cliente e a an�lise de documentos como t�cnica de elicita��o e foram obtidos os seguintes requisitos:
* Requisitos funcionais:
    -  O administrador deve poder abrir novos or�amento;
    -  O administrador deve poder cancelar or�amento;
    -  O administrador deve poder finalizar or�amento; 
    -  O sistema deve mostrar todos or�amentos cadastrados pelo admistrado; 
    -  O administrador deve poder adicionar produtos ao estoque; 
    -  O administrador deve poder remover produtos do estoque; 
    -  O sistema deve fazer a listagem de todos produtos em estoque;
    -  O sistema deve calcular todos os gastos que ser� cadastrado pelo adminstrador; 
    -  O sistema deve mostrar uma lista com o detalhamento dos gastos; 
    -  O sistema deve criar pedidos a partir de or�amento;  
    -  O sistema deve mostar o status de todos os pedidos, se foi conclu�do ou n�o;

* Requisitos n�o funcionais
  - O sistema deve ser online;
  - O sistema deve ter uma interface de f�cil compreens�o para o usu�rio;
  - O sistema deve utilizar o banco de dados Postgres;



## 4. Projeto da Solu��o

Para desenvolvimento do projeto n�s nos reunimos em um grupo de 4 pessoa e  utilizamos a metologia do Scrum, divido em 6 sprints de duas semanas. Onde dividimos as tarefas de desenvolvimento e documenta��o e pudemos acompanhar o progresso do trabalho. Durante o desenvolvimento do trabalho utilizamos de diversas ferramentas e tecnologias para concluirmos o trabalho proposto.

E foram uilizadas as seguintes tecnoligias:
  - GitHub para gerencia do codigo, planejamento e documenta��o;
  - Linguagem MarkDown para documenta��o;
  - Linguagens HMTL e CSS para desenvolvimento do front-end;
  - Linguagem JavaScript e ferramenta NodeJs para desenvolvimento do back-end;
  - Banco de Postgres para armazenamento dos dados do sistema;
  - Frameworks BootStrap e JQuery;
  - Ferramentas de modelagem Astah e Marvel App;
  - Ferramenta Heroku para hospedagem.

## 5. Artefatos principais

Durante a execu��o do trabalho foram gerados os seguintes artefatos
- Atas de reuni�o descrevendo as decis�es tomadas nas reuni�es com o grupo e com o cliente;
- Documento de vis�o mostrando o escopo do projeto e os seu respectivos requisitos;
- Diagrama de caso de uso com a demonstra��o das funcionalidades;
- Documenta��o de casos de uso descritivos com o detalhamento de cada uma das atividades que pode ser realizada pelo sistema;
- Diagrama de classes para mostar as rela��es entre as classes do sistema;
- Documentos de interface mostrando e descrevendo como � e o que cada tela do sistema faz.
  
�

    5.1 Diagramas
�

        5.1.1 Diagrama de caso de uso 
     
Foi proposto o seguinte diagrama de caso de uso para descrever as funcionalidades do sistema
![Diagrama de caso de uso](../artefatos/usecases/UseCase%20Diagram0.png)

        5.1.2 Diagrama de classes
        
O sistema consta de cinco classes de neg�cio para armazenagem e manipula��o dos dados que s�o descritas no digrama abaixo
![Diagrama de classes](../artefatos/Class%20Diagram0.png)

    5.2 Interfaces
�
 Foram propostas interfaces das diversas telas do sistema para intera��o com o usu�rio. Estas telas foram desenvolvidas utilizando HTML e o framework Bootstrap e est�o dispostas abaixo algumas das principais p�ginas do sistema:
     
        5.2.1 P�gina inicial
        
A p�gina inicial do sistema � uma tela simples que cont�m apenas um menu lateral que permite acessar todas as funcionalidades do sistema
![Pagina inicial](../artefatos/interfaces/leiaute/01-Tela-Inicial.jpeg)

        5.2.1 P�gina de cadastro de or�amento

A seguinte tela � para o cadastro de novos or�amentos, onde o administrador do sistema preenche os dados do clientes e os prdutos e servi�os que o cliente nescessita
![Pagina Novo Or�amento](../artefatos/interfaces/leiaute/05-Novo-or�amento.jpeg)

        5.2.1 P�gina de listagem de pedidos
        
 Na listagem dos pedidos aparecem todos os pedidos em aberto e que j� est�o finalizados, de modo que, para os pedidos abertos seja poss�vel visualizar e editar os dados, cancelar e finalizar e, para os pedidos finalizados seja poss�vel visualizar os detalhes
![Pagina Lista Pedidos](../artefatos/interfaces/leiaute/04-Lista-pedidos.jpeg)




  

## 6. Conclus�o

Por meio deste trabalho concluimos que para desenvolvermos o sistema, precisamos pesquisar conte�dos extras acerca das tecnologias, por meio de documenta��es e demais conte�dos disponibilizados em meio eletr�nico.

Tivemos como objetivo o desenvolvimento completo de um sistema capaz de gerenciar as demandas de estoque e pedidos de uma gr�fica. Nos foi solicitado que o sistema possuisse uma interface simples e de f�cil compreens�o.

Durante o desenvovimento, n�s lidamos com altera��es no projeto e nos requisitos e, nosso cliente, ficou muito satisfeito com o que produzimos.

Com isso podemos ter uma experi�ncia de campo de como � o desenvolvimento de sistemas, como funciona a rela��o com os clientes e como deve ser feita a gerencia do processo de cria��o. Durante a execu��o tivemos a oportunidade de colocar em pr�tica a maioria dos conceitos aprendidos nas mat�rias do curso, mas destacando-se Algoritmos e Estruturas de Dados, Banco de Dados e Desenvolvimento de Interfaces Web. Ao final do trabalho podemos observar que tivemos um grande aprendizado t�cnico e pr�tico.


# REFER�NCIAS


# AP�NDICES

**Links:**

[Reposit�rio no github](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2021-2-ti3-6653100-grafica);

Do v�deo de apresenta��o.



