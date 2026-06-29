# Quiz App 📝
 
A REST API project built with Spring Boot and PostgreSQL. It allows you to manage a question bank, create quizzes by category, and calculate scores. Questions are picked randomly from the database based on selected category. Built as a beginner Spring Boot project to learn REST APIs, JPA, and database integration.
 
## Tech Used
- Java 25
- Spring Boot 4.1
- Spring Data JPA
- PostgreSQL
- Lombok
- 
## Tools Used
- **IntelliJ IDEA** — IDE used to write and run the project
- **Postman** — Used to test all REST API endpoints (GET, POST, DELETE)
- **DBeaver** — Used to view and manage the PostgreSQL database tables
- **Maven** — Used to build the project and manage dependencies
- **GitHub** — Used to store and version control the project code
- 
## How to Run
 
1. Create a PostgreSQL database named `questiondb`
2. Update your password in `application.properties`
3. Run the project:
```
mvn spring-boot:run
```
Server starts at: `http://localhost:8081`
 
## API Endpoints
 
### Questions
| Method | URL | What it does |
|--------|-----|--------------|
| GET | `/question/allquestions` | Get all questions |
| GET | `/question/category/{category}` | Get questions by category |
| POST | `/question/add` | Add a new question |
| DELETE | `/question/{id}` | Delete a question |
 
### Quiz
| Method | URL | What it does |
|--------|-----|--------------|
| POST | `/quiz/create` | Create a quiz |
| GET | `/quiz/get/{id}` | Get quiz questions |
| POST | `/quiz/submit/{id}` | Submit answers and get score |

## Features
- Add new questions
- View all questions
- View questions by category
- Delete a question
- Cannot add same question twice
- Create a quiz
- Questions are picked randomly
- Correct answer is hidden from user during quiz
- Submit quiz and see your score
- Uses Controller, Service and Repository layers

  view score te/{id} | Update a question |
