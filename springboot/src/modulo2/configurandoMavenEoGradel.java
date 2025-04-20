package modulo2;

public class configurandoMavenEoGradel {
/*
 Configurando Maven no Eclipse
Instalar o Eclipse IDE:

Certifique-se de ter o Eclipse IDE instalado. A versão "Eclipse IDE for Java Developers" já vem com suporte ao Maven.
Criar um Novo Projeto Maven:

Abra o Eclipse.
Vá para File > New > Other....
Na janela que aparece, expanda a opção Maven e selecione Maven Project, depois clique em Next.
Na próxima tela, você pode escolher um local para o projeto ou usar o local padrão. Clique em Next.
Escolha um Archetype (modelo de projeto). Por exemplo, você pode escolher maven-archetype-quickstart para um projeto simples. Clique em Next.
Preencha os campos Group Id, Artifact Id, Version, e Package, e clique em Finish.
Adicionar Dependências:

Após criar o projeto, você verá um arquivo chamado pom.xml na raiz do projeto.
Abra o pom.xml e adicione suas dependências dentro da tag <dependencies>. Por exemplo:

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.10</version>
    </dependency>
</dependencies>

Salve o arquivo. O Eclipse irá automaticamente baixar as dependências.
Construir o Projeto:

Clique com o botão direito no projeto no Package Explorer.
Vá para Run As > Maven build....
Na janela que aparece, você pode especificar o ciclo de vida do Maven que deseja executar (por exemplo, clean install). Clique em Run.



***********************************************************************************************************************************************


Configurando Gradle no Eclipse
Instalar o Eclipse IDE:

Certifique-se de ter o Eclipse IDE instalado. Para suporte ao Gradle, você pode precisar instalar o plugin "Buildship".
Instalar o Buildship:

Vá para Help > Eclipse Marketplace....
Na barra de pesquisa, digite "Buildship" e clique em Go.
Encontre "Buildship Gradle Integration" e clique em Install. Siga as instruções para concluir a instalação.
Criar um Novo Projeto Gradle:

Vá para File > New > Other....
Na janela que aparece, expanda a opção Gradle e selecione Gradle Project, depois clique em Next.
Na próxima tela, você pode escolher um local para o projeto ou usar o local padrão. Clique em Next.
Preencha os campos Group Id, Artifact Id, e Version, e clique em Finish.
Adicionar Dependências:

Após criar o projeto, você verá um arquivo chamado build.gradle na raiz do projeto.
Abra o build.gradle e adicione suas dependências dentro da seção dependencies. Por exemplo:

dependencies {
    implementation 'org.springframework:spring-context:5.3.10'
}

Salve o arquivo. O Eclipse irá automaticamente baixar as dependências.
Construir o Projeto:

Clique com o botão direito no projeto no Package Explorer.
Vá para Gradle > Refresh Gradle Project para garantir que todas as dependências sejam baixadas e o projeto seja atualizado.
Para executar tarefas do Gradle, clique com o botão direito no projeto, vá para Gradle > Run Gradle Task..., 
e escolha a tarefa que deseja executar (por exemplo, build).
 
 */
}
