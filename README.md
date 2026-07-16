# Accounting

A compact Spring Boot application demonstrating the foundations of an accounting-oriented backend with REST, persistence, and an embedded development database.

## Technology stack

- Java 17
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- H2 Database
- JUnit 5
- Maven

## Purpose

This repository is a learning and demonstration project focused on:

- structuring a Spring Boot application
- exposing backend functionality through HTTP
- persisting domain data with Spring Data JPA
- running locally without an external database
- validating the application through automated tests and CI

## Run locally

Requirements:

- JDK 17 or newer
- Maven 3.6.3 or newer

Linux or macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
mvnw.cmd spring-boot:run
```

The application starts on `http://localhost:8080` by default.

## Build and test

```bash
./mvnw clean verify
```

## Project structure

```text
src/main/java       application source code
src/main/resources  configuration and application resources
src/test/java       automated tests
```

## Dependency maintenance

The project uses Spring Boot dependency management. Dependabot checks Maven and GitHub Actions dependencies weekly, while GitHub Actions validates every pull request with a clean Maven build.

## Development status

This is a demonstration project rather than a production accounting system. Production use would additionally require authentication, authorization, audit logging, database migrations, input validation, and integration tests.
