# E-Com Application

> **⚠️ WORK IN PROGRESS — Do not clone yet.** This will be a full 3-tier microservices application.  
> It will be soon deployed to a cloud platform.

A RESTful API for managing users, built with Spring Boot 4.1.0 and MySQL.

## Tech Stack

- **Java 21**
- **Spring Boot 4.1.0**
- **Spring Data JPA** — database access
- **MySQL** — database
- **Lombok** — boilerplate reduction
- **Springdoc OpenAPI** — API documentation (Swagger UI)

## Prerequisites

- Java 21+
- MySQL running on `localhost:3306`

## Quick Start

```bash
# Clone the repo
git clone <repo-url>
cd ecom-application

# Run with Maven Wrapper (auto-downloads Maven)
./mvnw spring-boot:run
```

The app starts on `http://localhost:9090`.

## Database

The database `ecom_db` is auto-created on startup.  
Tables are dropped and re-created each run (`create-drop`).  
Seed data (6 sample users) is loaded from `data.sql`.

### Configuration (application.properties)

| Property | Value |
|---|---|
| Port | `9090` |
| Database | `jdbc:mysql://localhost:3306/ecom_db` |
| DDL | `create-drop` |

## API Endpoints

Base URL: `http://localhost:9090/api/users`

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/users` | Get all users |
| `GET` | `/api/users/{id}` | Get user by ID |
| `POST` | `/api/users` | Create a new user |
| `PUT` | `/api/users/{id}` | Update a user |
| `DELETE` | `/api/users/{id}` | Delete a user |

### Example Request

```json
POST /api/users
Content-Type: application/json

{
  "name": "Helen Wilson",
  "email": "helen@example.com",
  "password": "pass444"
}
```

### User Schema

| Field | Type | Description |
|---|---|---|
| `id` | `Long` | Auto-generated |
| `email` | `String` | Unique |
| `password` | `String` | — |
| `name` | `String` | — |
| `createdAt` | `LocalDateTime` | Auto-set |
| `updatedAt` | `LocalDateTime` | Auto-updated |

## API Documentation (Swagger)

Once running, visit:
- **Swagger UI**: `http://localhost:9090/swagger-ui.html`
- **OpenAPI JSON**: `http://localhost:9090/v3/api-docs`

## IntelliJ HTTP Requests

Pre-built `.http` files are available in the `api-request/` directory for testing all endpoints directly from IntelliJ.
