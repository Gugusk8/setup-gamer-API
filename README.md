# 🎮 Setup Gamer API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

Esta é uma API de backend desenvolvida para gerenciar perfis de jogadores, servindo como base sólida para um ecossistema "Setup Gamer". [cite_start]O projeto foca em boas práticas de persistência de dados e configuração de ambiente profissional com Spring Boot[cite: 1, 9].

## 🚀 Tecnologias e Ferramentas

O projeto utiliza as seguintes tecnologias:
* [cite_start]**Java 17** [cite: 3]
* [cite_start]**Spring Boot 3** (Spring Web, Spring Data JPA) [cite: 1]
* [cite_start]**Maven**: Gerenciador de dependências [cite: 1]
* [cite_start]**H2 Database**: Banco de dados para desenvolvimento [cite: 5]
* [cite_start]**HikariCP**: Pool de conexões de alta performance [cite: 7]

## 🧠 Arquitetura e Aprendizados

Durante o desenvolvimento deste projeto, foram implementados e consolidados os seguintes conceitos de backend:

* [cite_start]**Mapeamento Objeto-Relacional (ORM)**: Utilização do **Hibernate** para traduzir automaticamente classes Java (Entidade `Gamer`) em tabelas SQL[cite: 2, 4].
* [cite_start]**Persistência em Disco**: Configuração do H2 em modo **file** (`jdbc:h2:file:./data/setup_gamer`), garantindo que os dados permaneçam salvos mesmo após o encerramento da aplicação[cite: 5].
* [cite_start]**Automação de Schema**: Uso da propriedade `ddl-auto=update` para que o banco de dados evolua automaticamente conforme as alterações nas entidades Java[cite: 4].
* [cite_start]**Gestão de Conexões**: Monitoramento do **HikariPool**, garantindo que a aplicação gerencie conexões de forma eficiente sem sobrecarregar o sistema[cite: 7].
* [cite_start]**Servidor Embutido**: A aplicação utiliza o servidor **Tomcat** configurado automaticamente pelo Spring Boot na porta 8080[cite: 1, 2].

## 🛠️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/Gugusk8/setup-gamer-API.git](https://github.com/Gugusk8/setup-gamer-API.git)
