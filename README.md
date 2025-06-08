# 🩺 Voll Med - API de Gestão de Médicos e Pacientes

Projeto de uma API RESTful feita em Java com Spring Boot para **cadastro, listagem, edição e exclusão** de médicos e pacientes. Desenvolvido com foco em boas práticas, usando MySQL como banco de dados principal.

---

## ✅ Funcionalidades

- 📋 Cadastro de médicos e pacientes
- 📄 Listagem paginada de médicos e pacientes
- ✏️ Edição de cadastros
- ❌ Exclusão lógica de registros
- 🧾 Validação de dados com Jakarta Validation
- 🌐 API REST com JSON

---

## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Jakarta Validation
- Maven

---

## ▶️ Como executar o projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-projeto.git
   cd nome-do-projeto

2. **Configure o banco MySQL**

- Crie um banco no MySQL (ex: vollmed) e atualize o application.properties:

- spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
- spring.datasource.username=seu_usuario
- spring.datasource.password=sua_senha
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true

## 🔄 Exemplo de Requisições

### 🔸 POST `/medicos`

```json
{
  "nome": "Dra. Ana",
  "email": "ana@clinica.com",
  "crm": "654321",
  "especialidade": "DERMATOLOGIA",
  "telefone": "11988887777",
  "endereco": {
    "logradouro": "Av. Paulista",
    "bairro": "Bela Vista",
    "cep": "01311923",
    "cidade": "São Paulo",
    "uf": "SP",
    "numero": "1000",
    "complemento": "Sala 3"
  }
}
```
🔹 GET /pacientes?page=0&size=10
```json
  {
    "id": 1,
    "nome": "Carlos da Silva",
    "email": "carlos@email.com",
    "cpf": "12345678900"
  }
```

📌 Observações
O projeto usa MySQL, mas pode ser adaptado facilmente para PostgreSQL ou H2.

O banco será atualizado automaticamente (ddl-auto=update).

O sistema de exclusão é lógico, não deleta de fato do banco.

Utiliza DTOs para entrada e saída de dados.

Ideal para estudo de boas práticas em APIs REST com Spring Boot.
