# Spring Boot Research Project: IoC, Exception Handling, and Interceptors

##  Project Description

This project demonstrates key concepts of the Spring Boot framework, including Dependency Injection (Inversion of Control), Exception Handling, and HTTP Interceptors. The goal is to show how Spring manages components, handles errors gracefully, and intercepts HTTP requests.

---

##  Technologies Used

* Java 17+
* Spring Boot
* Maven
* IntelliJ IDEA

---

## ️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/Jntorres2001/Task-1-Fundamentals-of-Spring-and-Architecture.git
   ```

2. Open the project in IntelliJ IDEA

3. Run the main class:

   ```bash
   DemoApplication.java
   ```

4. Open your browser and test:

    * http://localhost:8080/hola
    * http://localhost:8080/mierror

---

##  1. Dependency Injection (IoC)

Dependency Injection is a design pattern where the control of object creation is transferred to the Spring container.

###  Implementation

* A `SaludoService` class is created to handle business logic.
* The `HolaController` receives the service via constructor injection.

### Example

```java
private final SaludoService saludoService;

public HolaController(SaludoService saludoService) {
    this.saludoService = saludoService;
}
```

###  Benefits

* Loose coupling
* Better maintainability
* Easier testing

---

##  2. Exception Handling

Spring provides mechanisms to handle exceptions globally and locally.

### Implementation

* Custom exception handling using `@RestControllerAdvice`
* Method annotated with `@ExceptionHandler`

###  Example

```java
@ExceptionHandler(RuntimeException.class)
public String handleException(RuntimeException ex) {
    return "ERROR CAPTURED: " + ex.getMessage();
}
```

###  Test Endpoint

* http://localhost:8080/mierror

---

##  3. HTTP Interceptors

Interceptors allow processing of HTTP requests before and after they reach the controller.

###  Implementation

* Custom class implementing `HandlerInterceptor`
* Registered using `WebMvcConfigurer`

###  Methods Used

* `preHandle()` → before controller execution
* `postHandle()` → after controller execution
* `afterCompletion()` → after request completion

###  Use Cases

* Logging requests
* Authentication
* Performance monitoring

---

##  Project Structure

```
src
 └── main
     └── java
         └── com.example.demo
             ├── DemoApplication.java
             ├── HolaController.java
             ├── SaludoService.java
             ├── GlobalExceptionHandler.java
             ├── RecursoNoEncontradoException.java
             └── MiInterceptor.java
```

---

##  Conclusion

This project shows how Spring Boot simplifies backend development by managing dependencies, handling exceptions effectively, and providing tools like interceptors to control application flow. These features help build scalable and maintainable applications.

---

##  Author

Jennifer Torres
