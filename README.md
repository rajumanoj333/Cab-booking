# Cab Microservices System

This repository contains documentation for a microservices-based cab booking system, comprising three distinct services: `Cab-register`, `cab-login`, and `Cab-booking`.

## Overview

This system is designed to provide core functionalities for a cab booking application, separating concerns into individual microservices for better scalability, maintainability, and development.




## Microservices

### Cab-register

This microservice handles user registration for the cab booking system. It is built with Java and includes a Dockerfile for containerization.

### cab-login

This microservice handles user login for the cab booking system. It is built with Java and includes a Dockerfile for containerization.

### Cab-booking

This microservice handles cab booking functionalities. It is built with Java and includes a Dockerfile for containerization.




## Technologies Used

*   **Java**: Primary programming language for all microservices.
*   **Spring Boot**: Framework used for building the microservices.
*   **Maven**: Build automation tool for Java projects.
*   **Docker**: For containerization of each microservice.

## Setup and Usage

To set up and run these microservices, follow these general steps:

1.  **Clone the Repositories**: Clone each microservice repository to your local machine:

    ```bash
    git clone https://github.com/rajumanoj333/Cab-register.git
    git clone https://github.com/rajumanoj333/cab-login.git
    git clone https://github.com/rajumanoj333/Cab-booking.git
    ```

2.  **Build Each Microservice**: Navigate into each repository and build the project using Maven. Ensure you have Java and Maven installed.

    ```bash
    cd Cab-register
    mvn clean install
    cd ../cab-login
    mvn clean install
    cd ../Cab-booking
    mvn clean install
    ```

3.  **Containerize with Docker**: Each repository contains a `Dockerfile`. You can build Docker images for each service.

    ```bash
    cd Cab-register
    docker build -t cab-register .
    cd ../cab-login
    docker build -t cab-login .
    cd ../Cab-booking
    docker build -t cab-booking .
    ```

4.  **Run Docker Containers**: Once the images are built, you can run the containers. You might need to set up a Docker network for inter-service communication if they interact.

    ```bash
    docker run -p 8081:8080 cab-register
    docker run -p 8082:8080 cab-login
    docker run -p 8083:8080 cab-booking
    ```
    *(Note: Adjust port numbers and add network configurations as per your environment and inter-service communication needs.)*

5.  **API Endpoints**: Refer to the source code of each microservice for specific API endpoints and their usage.



