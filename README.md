# validations_spring_boot
Validations using Spring Boot version 3.0.4
This Spring Boot version uses a new import to validate fields: jakarta.validation.constraints
<br>
<br>
Spring Boot version 2.7.10 SNAPSHOT and oldest use: javax.validation.constraints
<br><br>
To run the application use the requests:
<br><br>
**REQUEST to return SUCCESS**
<br><br>
```
{
    "nome": "Maria Joana",<br>
    "email": "mj@email.com",
    "cpf": "192.394.982-09",
    "placaCarro": "FJE9804",
    "anoNascimento": 1900
}
```
<br><br>
**REQUEST to return ERROR MESSAGES**
<br>
```
{
    "nome": "",
    "email": "",
    "cpf": "",
    "placaCarro": "",
    "anoNascimento": 0
}
```
