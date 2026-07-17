# Accounting

A small Spring Boot accounting application built as a clean reference project for REST APIs and JPA persistence.

## Technology

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Run locally

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
mvnw.cmd spring-boot:run
```

## Build and test

```bash
./mvnw clean verify
```

## Continuous integration

GitHub Actions validates every pull request and every change to `main` by compiling the application and running its automated tests with Java 17.

## Project status

This repository is maintained as a compact demonstration project. Production use would require externalized configuration, a persistent database, authentication, authorization, observability, and deployment-specific hardening.
