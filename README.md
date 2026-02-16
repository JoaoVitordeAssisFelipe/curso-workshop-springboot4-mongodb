# 🚀 Projeto de Postagens com Java + MongoDB

## 📌 Sobre o Projeto

API REST desenvolvida com **Java e Spring Boot**, utilizando **MongoDB** como banco de dados NoSQL.

O sistema permite o gerenciamento de **Usuários, Postagens e Comentários**, aplicando boas práticas de arquitetura em camadas e modelagem de dados orientada a documentos.

Este projeto foi desenvolvido com foco em:

- Estruturação de API REST
- Modelagem de dados NoSQL
- Separação de responsabilidades (camadas)
- Boas práticas de desenvolvimento backend

---

## 🏗️ Arquitetura

A aplicação segue o padrão **MVC**, organizada nas seguintes camadas:


---

## 🧠 Regras de Negócio

- Um **User** pode ter vários **Posts**
- Um **Post** pode conter vários **Comentários**
- Cada **Comentário** possui:
  - Autor
  - Data
  - Conteúdo
- Filtro de posts por:
  - Texto
  - Intervalo de datas

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- MongoDB Compass
- Postman

---

## 🔍 Conceitos Aplicados

- ✔️ API REST
- ✔️ DTO Pattern
- ✔️ Tratamento de exceções
- ✔️ Consulta com múltiplos critérios
- ✔️ Relacionamento entre documentos (referência e embedding)
- ✔️ Injeção de dependência
- ✔️ Padrão Repository

--

## 📬 Endpoints Principais

👤 Usuários
Método	Endpoint
- GET	/users
- GET	/users/{id}
- POST	/users
- DELETE	/users/{id}

📝 Posts
Método	Endpoint
- GET	/posts/{id}
- GET	/posts/titlesearch?text=
- GET	/posts/fullsearch?text=&minDate=&maxDate=

## 🎯 Objetivo do Projeto

<p>Este projeto foi desenvolvido com o objetivo de consolidar conhecimentos em:</p>
- Desenvolvimento Backend com Java<br>
- Construção de APIs REST escaláveis<br>
- Integração com banco NoSQL<br>
- Organização profissional de código<br>

## ▶️ Como Executar o Projeto

```bash
# Clonar o repositório
git clone https://github.com/JoaoVitordeAssisFelipe/curso-workshop-springboot4-mongodb

# Entrar na pasta do projeto
cd caminho-da-pasta-nos-dowlods/workshopmongo

# Executar a aplicação
./mvnw spring-boot:run
