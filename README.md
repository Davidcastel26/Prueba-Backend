# Blautech Prueba API

Esta es una API desarrollada en **Java Spring Boot** con **MySQL** como base de datos. La API permite realizar operaciones CRUD sobre usuarios.

## 📂 Estructura del Proyecto

└── 📁src 
  └── 📁main 
    └── 📁java 
    └── 📁com.davidtest.blautechprueba 
    └── BlautechpruebaApplication.java 
      └── 📁users 
      └── 📁impl 
        └── UserServiceImpl.java 
      └── User.java 
      └── userController.java 
      └── UserService.java 
      └── 📁resources 
      └── 📁static 
      └── 📁templates
      
## 🚀 Funcionalidades

- **Crear un usuario** (`POST /users`)
- **Actualizar un usuario** (`PUT /users/{id}`)
- **Obtener un usuario por ID** (`GET /users/{id}`)
- **Obtener todos los usuarios** (`GET /users`)
- **Eliminar un usuario** (`DELETE /users/{id}`)

## 🛠️ Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## 🏗️ Configuración del Proyecto

1. **Clonar el repositorio**
   ```sh
   git clone <url-del-repositorio>
   cd blautechprueba

   Configurar la base de datos
Crea una base de datos en MySQL llamada blautech_prueba y asegúrate de configurar las credenciales en application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/blautech_prueba
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Compilar y ejecutar el proyecto

sh
Copy
Edit

mvn spring-boot:run
Probar la API
Puedes probar la API con Postman o cURL:

curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d '{"name":"David","email":"david@example.com"}'


