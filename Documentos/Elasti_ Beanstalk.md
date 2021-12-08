## Elastic Beanstalk:

* Passo a passo de como implementamos nossa API no Elastic Beankstalk

  ​

### Configurações no código:

----------

* Criar um arquivo [application-beanstalk.properties](https://github.com/Feruaro/Five-Stars-Bank/blob/main/FiveStarsBank/src/main/resources/application-beanstalk.properties) na pasta `\src\main\resources`:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/2_config_cod.jpg"/>

* Configurarações no arquivo [pom.xml](https://github.com/Feruaro/Five-Stars-Bank/blob/main/FiveStarsBank/pom.xml):

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/1_config_cod.jpg"/>

* Clicar com o botão direito na pasta principal do projeto -> run as -> Maven Builder

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/1_deploy.jpg"/>

* Preencher com as informações destacadas -> clicar em "Apply" -> clicar em "Run"

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/2_deploy.jpg"/>

> No final desse processo irá gerar um arquivo `.jar`

### Configuração na AWS:

--------

* Entrar no Elastic Beanstalk:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/3_deploy.jpg"/>

* Vamos criar um novo ambiente -> clicar em "criar um novo ambiente":

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/4_deploy.jpg"/>

* Nível de ambiente:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/5_deploy.jpg"/>

* Informações do aplicativo:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/6_deploy.jpg"/>

* Plataforma:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/7_deploy.jpg"/>

* Código do aplicativo -> "Fazer upload do código" -> "escolher arquivo" -> selecionar o arquivo `.jar`:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/8_deploy.jpg"/>

* Criando o ambiente:

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/9_deploy.jpg"/>

* Criado o ambiente temos mais uma configuração -> "Configuração" -> "Software" - "Editar":

  ​

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/10_deploy.jpg"/>

* Propiedades de ambiente - preencher com as seguintes informações -> "Aplicar":

  ​

  > SERVER_PORT  -  5000
  >
  > SPRING_PROFILES_ACTIVE  -  beanstalk, mysql

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/11_deploy.jpg"/>

### Ambiente e aplicativo criados:

------

<img src="https://github.com/Feruaro/Five-Stars-Bank/blob/main/Imagens/12_deploy.jpg"/>