# SpringMidtermProject
Spring Project
This project is a simple Spring Boot application that demonstrates basic CRUD operations for managing students. It provides RESTful endpoints to perform operations such as creating, reading, updating, and deleting student records.

Prerequisites
-Java 17
-Maven
Dependencies
-Spring Boot Starter Web
-Lombok
-Spring Boot Starter Data JPA
-PostgreSQL Driver
-Springfox for Swagger Documentation
-Spring Boot Starter Test




Technologies Used
-Java
-Spring Boot
-Lombok
-RESTful API
-H2 Database (in-memory database)
API Endpoints
-GET /api/v1/students: Get all students.
-POST /api/v1/students/save_student: Create a new student.
-GET /api/v1/students/{email}: Get student by email.
-PUT /api/v1/students/update_student: Update an existing student.
-DELETE /api/v1/students/delete_student/{email}: Delete student by email.


**Running the Application
Clone this repository to your local machine.
Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
Build and run the project.
Access the API endpoints using a REST client such as Postman or cURL.



**Usage
1.To retrieve all students: Send a GET request to /api/v1/students.
2.To create a new student: Send a POST request to /api/v1/students/save_student with the student data in the request body.
3.To retrieve a student by email: Send a GET request to /api/v1/students/{email} where {email} is the email address of the student.
4.To update an existing student: Send a PUT request to /api/v1/students/update_student with the updated student data in the request body.
5.To delete a student by email: Send a DELETE request to /api/v1/students/delete_student/{email} where {email} is the email address of the student to be deleted.


**Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
