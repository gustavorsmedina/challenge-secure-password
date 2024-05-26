# Desafio Senha Segura 🔒

Desafio proposto pela comunidade [Back-End Brasil](https://github.com/backend-br).  
Saiba mais: [Senha Segura](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md).
 
---

#### ☕ Tecnologias utilizadas:

- Java
- Spring Boot

---

## ⚙️ Passo a passo

#### 1 - Inicie a aplicação e ela estará disponível em:

- http://localhost:8080/v1/validate-password

#### 2 - Abra algum aplicativo para realizar suas requisições

- Algumas recomendações:  
[Insomnia](https://insomnia.rest/)  
[Postman](https://www.postman.com/)  
[Bruno](https://www.usebruno.com/)  

--- 

## 📨 Requisições

| Método | Url                            | Descrição                         | Corpo da requisição          |
| ------ | ------------------------------ | --------------------------------- | ---------------------------- |
| POST   | /v1/validate-password          | Valide uma senha.                 | [JSON](#validarsenha)        |

---

## 📄 Corpo das requisições

##### <a id="validarsenha">/v1/validate-password - Valide uma senha.</a>

```json
{
  "password": "vYQIYxO&p$yfI^r"
}
```




