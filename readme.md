# Acortador de URLs

Este es un servicio de acortamiento de URLs desarrollado con Spring Boot y MongoDB. Permite convertir URLs largas en versiones cortas y fáciles de compartir, además de mantener un registro de todas las URLs acortadas.

## Características

- Acortamiento de URLs largas a códigos alfanuméricos de 6 caracteres
- Redirección desde la URL corta a la URL original
- Almacenamiento persistente en MongoDB
- API RESTful para gestionar las URLs
- Registro de fecha de creación para cada URL acortada

## Requisitos Previos

- Java 23
- MongoDB 
- Maven
- Spring Boot 3.4.1

## Configuración

### Base de Datos

El proyecto utiliza MongoDB como base de datos. La configuración se encuentra en `application.properties`:

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=acortador
```

Asegúrate de tener MongoDB ejecutándose en tu sistema con la configuración especificada.

## Instalación

1. Clona el repositorio:
```bash
git clone https://github.com/Surita-pixel/springboot-acortador
```

2. Navega al directorio del proyecto:
```bash
cd acortador
```

3. Compila el proyecto:
```bash
mvn clean install
```

4. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

## Uso de la API

### Acortar URL
```http
POST /api/shorten
Content-Type: text/plain

[URL original]
```

### Obtener URL Original
```http
GET /api/shorten/{shortUrl}
```

### Listar Todas las URLs
```http
GET /api/shorten/all
```

## Estructura del Proyecto

```
src/main/java/com/acortador/acortador/
├── Controller/
│   └── EnlacesController.java
├── Service/
│   └── EnlacesService.java
├── model/
│   └── Enlace.java
└── repository/
    └── EnlacesRepository.java
```

## Tecnologías Utilizadas

- Spring Boot
- Spring Data MongoDB
- Maven
- Java 23
- MongoDB

## Dependencias Principales

- spring-boot-starter-data-mongodb
- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-test
- reactor-test

## Contribución

Las contribuciones son bienvenidas. Por favor, abre un issue primero para discutir los cambios que te gustaría realizar.

