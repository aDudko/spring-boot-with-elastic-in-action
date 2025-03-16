# Spring Boot with Elasticsearch in Action

**Example of implementing CRUD operations for Elasticsearch in Spring Boot applications**

## Overview

The application is designed as an internal microservice with no user interface.

Once the application is launched, it will need to communicate with Elasticsearch. The following endpoints will then be
available:

| Method | Path                             | Description                                                                       |
|--------|----------------------------------|-----------------------------------------------------------------------------------|
| POST   | `/items`                         | Registration of a new document to be saved in Elasticsearch                       |
| GET    | `/items/get/{id}`                | Find a document by ID                                                             |
| GET    | `/items/search/{term}`           | Find all documents by content                                                     |
| GET    | `/items/{pageNumber}/{pageSize}` | Getting all documents with pagination                                             |
| POST   | `/items/update`                  | Update document. If document with ID not exist, it will be saved in Elasticsearch |
| DELETE | `/items/{id}`                    | Delete the document by ID                                                         |

[API documentation](http://localhost:8080/swagger-ui/index.html#/) will be available once the application is started

## Technologies

- `Java` - version `21`
- `Maven` - for building the application
- `Spring Boot` - version `3.4.3`
- `Spring Cloud` - version `2023.0.3`
- `Spring Boot Actuator` - it's for real-world applications
- `Spring Boot Maven Plugin` - for create Docker-Image
- `Docker` - containerization
- `Docker-Compose` - infrastructure
- `Elasticsearch` - version `8.17.2` as NoSQL database

## Structure of the project

```
spring-boot-with-mongodb-in-action/
├── src/main/
|   ├── java/com/dudko/example/
|   |   ├── controller/             # domain level of requests and controllers
|   |   ├── domain/                 # persistent domain level and repositories
|   |   ├── model/                  # service level of the domain, used in business logic
|   |   ├── service/                # business logic
|   ├── resources/                  # configs
├── compose.yml                     # docker-compose file
├── pom.xml                         # artifact of Maven
├── postman_collection.json         # collection of requests for Postman
```

## How to try this project?

```sh
docker-compose -f compose.yml up
```

### Author:

Anatoly Dudko