# Spring MVC ModelAttribute with Hibernate

A Spring MVC project demonstrating form submission using `@ModelAttribute` and storing form data in a MySQL database using Hibernate (JPA).

## Features

- Spring MVC Java Configuration
- Form Handling
- @ModelAttribute
- Hibernate (JPA)
- Entity Persistence
- JSP Views

## Technologies Used

- Java
- Spring MVC
- Hibernate ORM
- JPA
- MySQL
- Maven
- JSP
- Apache Tomcat
- Eclipse IDE

## Project Structure

```
src
├── main
│   ├── java
│   │   ├── com.configuration
│   │   │   ├── Myconfig.java
│   │   │   └── WebInitializer.java
│   │   ├── com.controller
│   │   │   └── TestController.java
│   │   └── com.model
│   │       └── Student.java
│   └── webapp
│       ├── form.jsp
│       └── display.jsp
```

## Features Demonstrated

- Java-based Spring Configuration
- DispatcherServlet Configuration
- Component Scanning
- Form Submission
- @ModelAttribute
- Hibernate Entity Persistence
- JSP View Rendering

## Endpoints

### Display Form

```
GET /form
```

### Submit Form

```
GET /submit
```

Stores student details in the database and displays the submitted information.

## Annotations Used

- @Configuration
- @ComponentScan
- @Controller
- @GetMapping
- @ModelAttribute
- @Entity
- @Id

## How to Run

1. Clone the repository.
2. Configure MySQL database in `persistence.xml`.
3. Update Maven dependencies.
4. Deploy on Apache Tomcat.
5. Open `/form`.
6. Submit the form and verify the data in MySQL.

## Learning Outcomes

- Spring MVC
- Form Handling
- ModelAttribute
- Hibernate Integration
- JPA
- EntityManager
- JSP Integration

## Author

**Madiha Azam Ahmed**

GitHub: https://github.com/madihaazamahmed-droid
