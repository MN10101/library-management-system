# Library Management System

This repository contains Java files for a simple Library Management System.

## Overview

The project consists of several components:

1. **Controller**: Handles HTTP requests and manages the flow of the application.
2. **Service Layer**: Contains the business logic of the application.
3. **DAO (Data Access Object)**: Provides an interface between the application and the database.
4. **Entity**: Represents the data model of the application.

## Controller

### `BookController.java`

This controller class manages requests related to books. It handles operations such as retrieving all books, adding a new book, updating a book, and deleting a book.

## Service Layer

### `BookService.java`

This service class contains methods to interact with the database and perform operations on book entities. It implements the `BookServiceInterface`.

## DAO

### `BookDAO.java`

This DAO class provides methods to perform CRUD operations on the database for book entities. It implements the `BookDAOInterface`.

## Entity

### `Book.java`

This entity class represents the book entity stored in the database.

## Configuration

The `application.properties` file contains configuration settings for the Spring Boot application.

### `application.properties`

This file contains the following configuration properties:

- `spring.application.name`: Defines the name of the Spring Boot application as "library-management-system".

- `spring.datasource.url`: Specifies the JDBC URL for connecting to the MySQL database named "library_management" running on localhost with port 3306.

- `spring.datasource.username`: Specifies the username for authenticating with the MySQL database as "****".

- `spring.datasource.password`: Specifies the password for authenticating with the MySQL database as "****".

## Usage

To use these Java files and configuration properties:

1. Update the values of the properties in the `application.properties` file as needed for your environment.
2. Compile and run the Java files using your preferred IDE or build tool.

## Dependencies

- Spring Boot: The Java files are intended for use with Spring Boot applications.
- MySQL: The application is designed to work with a MySQL database.


## Author

- Mahmoud Najmeh
