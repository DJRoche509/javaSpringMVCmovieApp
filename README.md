# Java Spring MVC Movie App

## Overview

Welcome to the Java Spring MVC Movie App! This web application is designed as a simple yet comprehensive demonstration of using the Spring Framework for building a Java-based web application. It leverages Spring MVC for handling web requests and Thymeleaf as a template engine for dynamic web pages.

## Features
* Movie Listing: Displays a list of movies, fetched from an in-memory database.
* Add New Movies: Allows users to add new movies to the list with details like title, director, and release date.
* Movie Details View: Users can view detailed information about each movie.

## Getting Started
### Prerequisites
* JDK 1.8 or later
* Maven 3.2+
* Spring Framework
  
### Installation
1. Clone the repository
   ```
   git clone https://github.com/DJRoche509/javaSpringMVCmovieApp.git
   ```
2. Navigate to the repository directory
    ```
    cd javaSpringMVCmovieApp
    ```
3. Build the project using Maven
    ```
    mvn clean install
    ```
4. Run the application
    ```
    mvn spring-boot:run
    ```
The application will start running on http://localhost:8080.

## Usage / API Features:
Once the application is running, you can use a web browser to view and interact with the movie list. It supports the following **CRUD** operations:
* **GET `/movies`**: Retrieve the list of movies.
     - Go to http://localhost:8080/movies to see the list of movies.
* **GET `/movies/{id}`**: Retrieve details of a specific movie.
* **POST `/movies/add`**: Add a new movie.
* **PUT `/movies/update/{id}`**: Update the details of an existing movie.
* **DELETE `/movies/delete/{id}`**: Delete a movie from the list.

## Contributing
Contributions to enhance this Java Spring MVC Movie App are welcomed. To contribute:

1. Fork the repository.
2. Create your feature branch (git checkout -b feature/AmazingFeature).
3. Commit your changes (git commit -m 'Add some AmazingFeature').
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a pull request.

## Contact
Developer: Junior David Roche </br>
Email: davjroche@gmail.com 

## Acknowledgments
Spring Framework
Thymeleaf
Maven
