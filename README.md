# Spring Boot Quiz App

A RESTful Quiz Application developed using Spring Boot.

## Features

- Add new questions
- View all questions
- Update questions
- Delete questions
- Layered Architecture (Controller, Service, Repository)
- Spring Data JPA integration

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- PostgreSQL


## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /question/allQuestions | Get all questions |
| POST | /question/add | Add a question |
| DELETE | /question/delete/{id} | Delete a question |
| PUT | /question/update/{id} | Update a question |

## Future Enhancements

- Quiz creation module
- Score calculation
- User authentication using Spring Security
- Exception handling
- DTO implementation
