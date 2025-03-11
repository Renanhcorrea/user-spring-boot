# Spring Boot API

## Overview
This project is a simple Spring Boot application that provides user authentication with login and password management.

## Technologies Used
- Java 17
- Spring Boot 3.4.3
- Spring Data JPA
- H2 Database
- Maven

## Setup Instructions

### Prerequisites
- Java 17 installed
- Maven installed
- Postman (or another API testing tool)

### Running the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/Renanhcorrea/user-spring-boot.git
   cd your-repo
   ```
2. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```
3. The application will start on `http://localhost:8080`.

### Database Configuration
This project uses an H2 in-memory database. You can access the H2 console at:
```
http://localhost:8080/h2-console
```
JDBC URL:
```
jdbc:h2:tcp://localhost/~/test
```
User: `SA`
Password: (leave empty)

## API Endpoints

### Create a User
**Endpoint:**
```
POST /users
```
**Request Body (JSON):**
```json
{
  "login": "username",
  "password": "securepassword"
}
```

### Get All Users
**Endpoint:**
```
GET /users
```

### Get a User by ID
**Endpoint:**
```
GET /users/{id}
```

### Update a User
**Endpoint:**
```
PUT /users/{id}
```
**Request Body (JSON):**
```json
{
  "login": "newusername",
  "password": "newpassword"
}
```

### Delete a User
**Endpoint:**
```
DELETE /users/{id}
```

## Testing with Postman
1. Open Postman.
2. Create a new request and select the appropriate HTTP method.
3. Enter the API URL (`http://localhost:8080/users`).
4. For POST and PUT requests, go to the "Body" tab and select "raw" with JSON format.
5. Click "Send" to test the endpoint.

## License
This project is licensed under the MIT License.
