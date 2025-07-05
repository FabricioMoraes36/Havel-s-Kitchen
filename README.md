#  Havel's Kitchen – Prepare-se para cozinhar... e sofrer

Bem-vindo à **Havel's Kitchen**, uma API REST inspirada no universo sombrio e desafiador da série *Souls*. Aqui não tem receita fácil, não tem modo casual, e cada ingrediente pode te esmagar como uma pancada do Havel.

---

## Sobre o projeto

Havel's Kitchen é uma API desenvolvida em Java com Spring Boot que oferece uma estrutura para cadastrar, listar, atualizar e remover **receitas brutais**. A proposta é aprender enquanto me divirto com um projeto temático, misturando culinária e o sofrimento no jogo.

> Porque cozinhar também pode ser uma *boss fight*.

---

## ⚙️ Tecnologias e ferramentas usadas

- ☕ **Java 17+**
- 🧱 **Spring Boot 3**
- 💾 **Spring Data JPA**
- 🧠 **Lombok**
- 🛢️ **H2 Database** (Por enquanto...)
- 📦 **Maven**

---

## 📌 Funcionalidades (até agora)

- ✅ Cadastrar uma nova receita
- ✅ Listar todas as receitas
- ✅ Buscar uma receita por ID
- ✅ Deletar uma receita (em breve)
- 🚧 Relacionar ingredientes com receitas (em prod)
- ⏳ Atualizar uma receita (em breve)
- 🧪 Validação de dados (em breve)

---

## 🧾 Estrutura básica da receita

Cada receita possui:

- `id`: identificador único
- `name`: nome da receita
- `description`: descrição rápida
- `difficulty`: enum de dificuldade (ex: EASY, MEDIUM,HARD e BOSS)
- `baseIngredients`: lista dos ingredientes principais
- `soulCount`: a quantas pessoas(souls) a receita serve
- `createdAt` / `updatedAt`: tempo da criação e atualização da receita
