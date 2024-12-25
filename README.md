# Interactive Quiz Platform

This project is a **Quiz Application** built using **Spring Boot**, **PostgreSQL**, and the **MVC Architecture**. The application supports CRUD operations for questions and quiz management, enabling administrators to create quizzes, evaluate user responses, and calculate scores dynamically. The application leverages Spring Data JPA for efficient data management and includes robust exception handling to ensure reliability.

---

## Features

### Question Microservice
- **CRUD Operations**:
  - Add a new question.
  - Retrieve all questions by category.
  - Update a question.
  - Delete a question.
- Optimized database queries using **Spring Data JPA** for improved performance.

### Quiz Microservice
- **Admin Features**:
  - Create a quiz with a custom selection of questions.
  - Verify and evaluate user responses for quizzes.
  - Calculate and return the score for submitted quizzes.

### Technical Highlights
- **Scalable Architecture**: Designed with RESTful APIs for modularity and extensibility.
- **Database Operations**: Integrated with PostgreSQL for persistent data storage and pgAdmin for database management.
- **API Testing**: Used Postman for testing and verifying API responses.

---

## Technologies Used

- **Spring Boot**: Backend framework for building REST APIs.
- **PostgreSQL**: Database for data storage.
- **Spring Data JPA**: ORM for efficient database interaction.
- **IntelliJ IDEA**: IDE for development.
- **pgAdmin**: Database administration tool.
- **Postman**: Tool for API testing and response verification.

---
## Screenshots (Postman)
- Adding new Question
![image](https://github.com/user-attachments/assets/b53b115a-73c0-4e83-97ab-db11a930324c)

- Get questions by category
![image](https://github.com/user-attachments/assets/789b5d70-baf1-4d3e-986c-55a8e1a9cb76)

- Quiz creation
![image](https://github.com/user-attachments/assets/0b24c1c9-bf3e-48c5-b41f-96d337677c74)

- Quiz score calculation
![quizScore](https://github.com/user-attachments/assets/96de7e63-dff3-4215-b81e-58cae9f277c1)


---

## Future Enhancements
- Add user authentication for secured access to APIs.
- Support for timed quizzes.
- Enhanced reporting and analytics for quiz performance.
- Implement caching for frequently accessed data to improve response times.


