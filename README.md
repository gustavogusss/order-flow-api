# Use Case 1 — Sistema de Pedidos (Order Flow)

## Contexto

Você precisa construir um sistema simples de pedidos onde um usuário:

- cria um pedido
- adiciona itens
- finaliza o pedido

Após a finalização:

- o pedido precisa ser processado
- o status deve ser atualizado (ex: criado, pago, enviado)

---

## Problemas a resolver

- como organizar o fluxo de criação e finalização?
- onde validar regras de negócio?
- como modelar status do pedido?
- como evitar inconsistência de dados?

---

## Pontos de decisão

- monolito bem estruturado ou microserviço?
- uso de banco relacional
- modelagem de entidades vs DTO
- controle de estado (enum, tabela, etc.)

---

## Tecnologias sugeridas

- Java + Spring Boot
- REST API
- PostgreSQL
