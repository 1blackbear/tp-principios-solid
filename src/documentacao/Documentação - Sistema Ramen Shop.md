# Sistema Ramen Shop

**Erick Vinicius Oliveira de Paiva, erick.paiva@sga.pucminas.br**

**Rafael Duarte Pereira, rafaelduarte1234.2015@gmail.com**
  

---

_Curso de Engenharia de Software, Unidade Pra�a da Liberdade_

_Instituto de Inform�tica e Ci�ncias Exatas � Pontif�cia Universidade Cat�lica de Minas Gerais (PUC MINAS), Belo Horizonte � MG � Brasil_

---

_**Resumo**. Atualmente, � poss�vel analisar que softwares embarcados s�o cada vez mais utilizados em estabelecimentos comercias de comida. Assim, os Ramens Shops, restaurantes japoneses de ramen, apesar de eficientes, possuem tal necessidade de moderniza��o. Dessa forma, nesse projeto iremos prover uma solu��o em c�digo para este problema, atrav�s da linguagem de programa��o Java como back-end da aplica��o e do Java Swing como front-end, de modo que ir� sanar por vez a car�ncia apontada pelos Ramens Shops._

---


## 1. Introdu��o

    1.1 Contextualiza��o

Na atualidade, h� de se afirmar que, desde o in�cio da Revolu��o T�cnico-Cient�fica, o mundo vem se modernizando cada vez mais. Desse modo, restaurantes, por consequ�ncia, tamb�m se tornam ref�ns da moderniza��o, tal como o Mc Donalnads, que em muitos estabelecimentos de sua propriedade possuem m�quinas especializadas em realizar pedidos dos clientes de maneira autom�tica, sem a necessidade de um ser humano atendente na interven��o.

    1.2 Problema

� vista disso, o Ramen Shop, um tipo de restaurante muito comum no Jap�o, h�, tamb�m, a necessidade de se modernizar, de modo que para a realiza��o dos pedidos de ramens de modo eficaz � fulcral o uso de um software embarcado, como o existente em alguns estabelecimentos do Mc Donalds.

    1.3 Objetivo geral

Para tal possibilidade, � preciso desenvolver um sistema capaz de realizar pedidos a partir de um menu. Al�m disso, por tr�s da interface do usu�rio, o sistema deve obter apenas uma �nica lista de espera dos pedidos e gerar um balan�o geral de todos os pedidos j� feitos naquela m�quina, para controle do restaurante.

        1.3.1 Objetivos espec�ficos
Portanto, os objetivos espec�ficos desse projeto s�o:

- Criar menu capaz de realizar pedido automatizado.
- Gerar senha para retirada do pedido pelo cliente.
- Notificar pedido pronto ao cliente.
- Controlar status do pedido por meio de um observador.
- Adicionar pedidos prontos ao balan�o final do restaurante.


  
�

    1.4 Justificativas

Assim, tendo o problema em vista, a cria��o do sistema ser� de grande utilidade para automatiza��o de processos manuais dos Ramens Shop, o que nos deixa determinados a conseguir prover uma solu��o para este �bice.


## 2. Stakeholders

O projeto possui um �nico stakeholder, o cliente (pessoas f�sica ou jur�dica) o qual deseja realizar o seu pedido de maneira automatica, por meio de tal m�quina.


## 3. Proposta da solu��o

No sistema a ser desenvolvido a m�quina acesa na cal�ada deve exibir o menu onde o cliente escolhe o prato que ir� comer. Ele recebe uma senha e ir� buscar o prato quando estiver pronto no restaurante. O menu do sistema ir� seguir as regras apresentadas abaixo (Figura 1). O cliente poder� escolher o tamanho do prato, que possuir� um pre�o base. A cada adicional no Combo, o pre�o dever� ser acrescido. Ao terminar a escolha, o sistema deve calcular o total e emitir o n�mero do pedido. O pedido ent�o deve ser adicionado a uma lista de espera �nica. Quando um pedido estiver pronto, o cliente dever� receber a notifica��o. Ap�s o cliente marcar o pedido como retirado, o pedido ir� para o balan�o final do restaurante.

<p align="center">
  <img src="../../imgs/menu.png" alt="Menu Ramen Shop.">
</p>

A partir da an�lise de documento como t�cnica de elicita��o, foram obtidos os seguintes requisitos:

* Requisitos funcionais:
   -  O sistema deve conter um menu Ramen Shop.
    -  O sistema deve permitir a montagem combo de comidas ou bebida.
    -  O sistema deve emitir o numero do pedido ao final.
    -  O sistema deve adicionar o pedido a uma lista de espera �nica.
    -  O sistema deve notificar o cliente quando o pedido estiver pronto.
    -   O sistema deve adicionar o pedido ao balan�o final do restaurante.
    -   O sistema deve permitir que o cliente retire o pedido por meio de uma senha.

* Requisitos n�o-funcionais:
  - O sistema deve conter testes unit�rios.
  - O sistema deve garantir que s� exista uma �nica lista de espera no restaurante.
  - O sistema deve seguir pelo menos tr�s padr�es de projeto.
  - O sistema deve possuir tratamento de exce��es.



## 4. Projeto da Solu��o

Para o desenvolvimento do trabalho nos reunimos em dupla e dividimos as tarefas entre n�s, de modo que cada um ficasse respons�vel com metade dos requisitos do sistema, aumentando a produtividade no desenvolvimento. 

Utilizamos Java como linguagem de programa��o para o back-end e padr�es de projeto Singleton, Decorator e Observer para que o sistema atendesse aos princ�pios SOLID. Foram realizados testes unit�rios para a valida��o dos requisitos do sistema utilizando o framework de testes automatizados JUnit. E tratamento de exce��es para garantir o funcionamento sem a ocorrencia de falhas.

Desenvolvemos uma interface de usuario simples utilizando como base o card�pio do _Ramen Shop_ que nos foi apresentado com o framework gr�fico do Java Swing realizando o devido tratamento de eventos. 


## 5. Artefatos principais

Durante o desedesenvolvimento al�m da produ��o do software foi gerado o diagrama de classes do sistema mostrando as classes necess�rias  e o relacionamento entre as mesmas.


  
�

    5.1 Diagrama de classe

O diagrama consta com uma lista que implementa o padr�o Singleton para garantir a exist�ncia de uma �nica lista de pedidos, o padr�o Observer para realizar as opera��es de inser��o e remo��o dos pedidos na lista conforme ele altera seu estado e padr�o Decorator para a defini��o do tipo de carne de cada prato e os extras que podem ser adicionados no mesmo.

![diagrama de classe](../diagram/PM_TP_Diagram.jpg "Diagrama de clase")

    5.2 C�digo fonte

Assim, para obter conformidade com o diagrama de classes proposto anteriormente, e al�m disso obedecer aos princ�pios SOLID, a classe Pedido foi implementada com apenas os atributos necess�rios para o neg�cio da classe. Assim, na imagem abaixo, pode-se observar o uso de um atributo inteiro final "num_pedido", o qual � respons�vel por guardar um valor �nico aleat�rio de pedido entre 1000000 e 9999999, uma lista de IProdutos "combo", um sujeito para ser observado posteriormente "subject_status" e por fim o status do pedido em forma de String.

<p align="center">
  <img src="../../imgs/pedido/pedido_img1.jpg" alt="Imagem 1 Pedido">
</p>

O construtor da classe pedido tem como objetivo apenas instanciar uma nova refer�ncia para cada vari�vel citada anteriormente. Contudo, como o status � posto como "Pedido Realizado" na inst�ncia do objeto Pedido, � necess�rio notificar o observer tal mudan�a por meio do m�todo "notifyObserver" do "subject_status".

<p align="center">
  <img src="../../imgs/pedido/pedido_img2.jpg" alt="Imagem 2 Pedido">
</p>

O m�todo p�blico "calcularTotal" � respons�vel por fazer aquilo que o pr�prio nome diz: calcular o valor total do combo solicitado pelo cliente no Pedido. Para isso, � percorrido toda a lista de IProduto "combo" acrescendo o valor total para cada item presente no combo.

<p align="center">
  <img src="../../imgs/pedido/pedido_img3.jpg" alt="Imagem 3 Pedido">
</p>

Como toda classe de neg�cio que possui lista, os m�todos "addProduto" e "removeProduto" s�o respons�veis por realizar o CRUD da classe ao acrescer e retirar Produtos da lista de IProtudos "combo" presente no Pedido.

<p align="center">
  <img src="../../imgs/pedido/pedido_img4.jpg" alt="Imagem 4 Pedido">
</p>

Por �ltimo, ainda na classe Pedido, o m�todo "setStatus" tem como fun��o alterar o status do pedido, al�m disso, quando houver alguma mudan�a de status do pedido, � preciso notificar a mudan�a pelo m�todo "notifyObserver" presente no "subject_status" do Pedido.

<p align="center">
  <img src="../../imgs/pedido/pedido_img5.jpg" alt="Imagem 5 Pedido">
</p>

A classe "LEsperaSingleton" procura fazer uma lista de espera �nica para os pedidos, de modo que n�o haja nenhuma lista paralela em andamento. Para tal, o padr�o de projeto Singleton se faz de extrema necessidade, uma vez que por meio dele � garantido que n�o haja nenhuma outra inst�ncia da classe diferente da retornada pelo m�todo "getInstancia".

<p align="center">
  <img src="../../imgs/lespera/lespera_img1.jpg" alt="Imagem 1 Lista de Espera">
</p>

Assim, tamb�m h� os m�todos CRUD "addPedido" e "removePedido" para manuseio da lista de pedidos presente na classe.

<p align="center">
  <img src="../../imgs/lespera/lespera_img2.jpg" alt="Imagem 2 Lista de Espera">
</p>

A classe abstrata observer tem por fun��o prover � classe concreta os m�todos e atributos necess�rios para atualizar o alvo que est� sendo observado. Desse modo, a implementa��o deste padr�o de projeto ir� nos ajudar a mudar o estado da lista de espera conforme mudan�a do status do pedido, como mencionado anteriormente no "setStatus".

<p align="center">
  <img src="../../imgs/observer/obs_img1.jpg" alt="Imagem 1 Observer">
</p>

A classe ObserverConcrect ir� extender a classe abstrata Observer, assim atrav�s do polimorfismo ir� receber os m�todos da classe m�e e ir� sobrescrev�-los.

<p align="center">
  <img src="../../imgs/observer/obs_img2.jpg" alt="Imagem 2 Observer">
</p>

O m�todo que ser� sobrescrito ser� o "update", que a implementa��o servir� para ao houver mudan�a de status do Pedido, adicionar e remover o Pedido da lista de espera, al�m de que caso o pedido esteja retirado pelo cliente, o pr�prio ser� acrescido ao bala�o geral do restaurante.

<p align="center">
  <img src="../../imgs/observer/obs_img3.jpg" alt="Imagem 3 Observer">
</p>

Para adi��o do Pedido ao balan�o final, o m�todo "saveToBalanco", ainda presente na classe ObserverConcrect, ir� gravar os dados desse Pedido em um arquivo bin�rio "balanco.bin".

<p align="center">
  <img src="../../imgs/observer/obs_img4.jpg" alt="Imagem 4 Observer">
</p>

J� a classe "SubjectPedido" foi criada como forma de obedi�ncia ao princ�pio SOLID da responsabilidade �nico, de modo que ela servir� para fazer a comunica��o entre o Pedido e o Observer sem precisar da classe Pedido ter ci�ncia de que est� sendo observada de maneira direta pelo Observer.


<p align="center">
  <img src="../../imgs/observer/obs_img5.jpg" alt="Imagem 5 Observer">
</p>

A interface gen�rica "IDAO<T>" foi criada para declarar os metodos de acesso aos dados armazenados em arquivo, como � uma interface generica � capaz de funcionar com qualquer classe serializada.

<p align="center">
  <img src="../../imgs/idao/idao_img1.png" alt="Imagem 1 IDAO">
</p>

A classe "PedidoDAO" implenta a interface IDAO e tem a responsabilidade de manipular os arquivos de balan�o do ramen shop. Tem como atributos objetos de classes do Java respon�veis pela manipulacao dos arquivos.

<p align="center">
  <img src="../../imgs/pedidodao/pedidodao_img1.png" alt="Imagem 1 PedidoDAO">
</p>

Ela implementa os m�todo da interface tratando as excess�es.

<p align="center">
  <img src="../../imgs/pedidodao/pedidodao_img2.png" alt="Imagem 2 PedidoDAO">
</p>

A interface "IProduto" � a classe responsavel pela generaliza��o dos produtos e foi criada em concordancia ao princ�pio SOLID da invers�o de depencia, de modo que o pedido n�o ser� responsavel por trabalhar diretamente com os produtos concretos mas sim com a interface 

<p align="center">
  <img src="../../imgs/iproduto/iproduto_img1.png" alt="Imagem 1 IProduto">
</p>

Para a defini��o dos produtos foram usadas as classes abstratas "Prato" e "Bebida" que implementam a interface IProduto e declaram os metodos getDescricao() e getPreco como abstratos para que as classes que extendem sejam obrigados a implementar esses m�todos

<p align="center">
  <img src="../../imgs/iproduto/iproduto_img2.png" alt="Imagem 2 IProduto">
</p>

Desse modo as classes "PratoGrande", "PratoMedio", "PratoPequeno" herdam de "Prato" e sobreescrevem os m�todos definindo cada uma a sua descri��o e pre�o.

<p align="center">
  <img src="../../imgs/iproduto/iproduto_img3.png" alt="Imagem 3 IProduto">
</p>

Por semelhante modo as classes "KoCha", "OCha" e "Refrigerante" herdam de "Bebida" e sobreescrevem os m�todos com a descri��o e pre�o.

<p align="center">
  <img src="../../imgs/iproduto/iproduto_img4.png" alt="Imagem 4 IProduto">
</p>

Na defini��o das carnes do prato temos a classe abstrata "ComidaDecorator" que herda de "Prato" e est� em conformidade o padr�o Decorator onde tem um �nico atributo que � um prato onde � acrescentado o tipo de carne.

<p align="center">
  <img src="../../imgs/comidadecorator/comidadecorator_img1.png" alt="Imagem 1 ComidaDecorator">
</p>

O constrututor dessa classe apenas recebe um prato e testa se � valido e define como atributo

<p align="center">
  <img src="../../imgs/comidadecorator/comidadecorator_img2.png" alt="Imagem 2 ComidaDecorator">
</p>

Os m�todos getPreco() e getDescricao() apenas retornam o preco e a descricao do prato que � atributo

<p align="center">
  <img src="../../imgs/comidadecorator/comidadecorator_img3.png" alt="Imagem 3 ComidaDecorator">
</p>

As classes "CarneBoi", "CarnePorco" e "CarneVegana" herdam de "ComidaDecorator", o construtor apenas define o prato chamando o construtor da superclasse. A classe sobrescreve os metodos getDescricao() e getPreco() retornando a classe pai acrescentando o tipo de carne na descri��o e aumentado o preco.

<p align="center">
  <img src="../../imgs/comidadecorator/comidadecorator_img4.png" alt="Imagem 4 ComidaDecorator">
</p>

Mantendo o padr�o decorator a classe abstrata "IngredienteDecorator" herda de "ComidaDecorator" e sobreescreve os m�todos retornando a classe pai

<p align="center">
  <img src="../../imgs/ingredientedecorator/ingerdientedecorator_img1.png" alt="Imagem 1 IngredienteDecorator">
</p>

As classes "CarneExtra", "Chili", "CremeAlho", "Croutons", "Shitake" e "Tofu" herdam de "IngredienteDecorator", o construtor apenas define o prato chamando o construtor da superclasse. A classe sobrescreve os metodos getDescricao() e getPreco() retornando a classe pai acrescentando o tipo de extra na descri��o e aumentado o pre�o.

<p align="center">
  <img src="../../imgs/ingredientedecorator/ingerdientedecorator_img2.png" alt="Imagem 2 IngredienteDecorator">
</p>

  

## 6. Conclus�o

Com esse podemos aprender mais acerta dos conceitos de programa��o orientada a objetos e aplicar os conceitos aprendidos nas mat�rias de Programa��o Modular e Laborat�rio de Programa��o Modular. Tamb�m podemos compreender acerca do desenvolvimento de aplica��es completas em Java e a utiliza��o de tecnicas de desenvolvimento e padr�es de projetos e principios SOLID.
