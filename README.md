# API REST de Produtos – Spring Boot

Projeto desenvolvido para praticar **Spring Boot**, **APIs REST** e **persistência de dados** com **Spring Data JPA**.

##  Objetivo

Criar uma API REST simples para cadastro de produtos, permitindo:

- Listar produtos
- Buscar produto por ID
- Cadastrar novo produto
- Atualizar produto
- Deletar produto

---

##  Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco em memória H2 (para testes)
- Maven

---

##  Endpoints principais

- `GET /produtos` – lista todos os produtos  
- `GET /produtos/{id}` – busca um produto por ID  
- `POST /produtos` – cria um novo produto  
- `PUT /produtos/{id}` – atualiza um produto  
- `DELETE /produtos/{id}` – remove um produto  

---

##  O que pratiquei neste projeto

- Criação de API REST com Spring Boot  
- Mapeamento de entidade com JPA  
- Uso de Spring Data JPA (Repository)  
- Testes com banco H2  
- Boas práticas de organização de camadas (controller, service, repository)

---

##  Como executar

1. Clonar o repositório  
2. Importar o projeto na IDE (IntelliJ / Eclipse / VS Code)  
3. Executar a classe `ApiProdutosApplication`  
4. Testar os endpoints usando Postman ou navegador
