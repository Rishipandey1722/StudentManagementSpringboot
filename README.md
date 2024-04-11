# Student Management System

This is a simple web application built using Spring Boot and Thymeleaf for managing student information.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Student Management System allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. It provides a user-friendly interface for adding, editing, and deleting students.

## Features

- View a list of all students
- Add a new student
- Edit existing student information
- Delete a student
- Responsive and modern user interface

## Installation

To run the application locally, make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- MySQL (or any other supported database)

Follow these steps to set up the application:

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/StudentManagement.git
    ```

2. Navigate to the project directory:

    ```bash
    cd StudentManagement
    ```

3. Open `src/main/resources/application.properties` and configure your database connection settings:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/student_management
    spring.datasource.username=root
    spring.datasource.password=root
    ```

4. Build the project using Maven:

    ```bash
    mvn clean install
    ```

5. Run the application:

    ```bash
    java -jar target/student-management-0.0.1-SNAPSHOT.jar
    ```

6. Access the application in your web browser at `http://localhost:8080`.

## Usage

Once the application is running, you can perform the following actions:

- View a list of all students by navigating to `/students` endpoint.
- Add a new student by navigating to `/student/new`.
- Edit an existing student's information by clicking on the "Edit" button next to the student's details.
- Delete a student by clicking on the "Delete" button next to the student's details.

## Contributing

Contributions are welcome! If you have any ideas, suggestions, or improvements, feel free to open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).



## Entity Class: Student

The `Student` class represents a student entity in the Student Management System. It contains fields for storing information about a student, including their first name, last name, and email address.

### Attributes

- `id` (Long): The unique identifier for the student.
- `firstName` (String): The first name of the student.
- `lastName` (String): The last name of the student.
- `email` (String): The email address of the student.

### Constructors

The class provides the following constructors:

- `Student(String firstName, String lastName, String email)`: Constructs a new `Student` object with the specified first name, last name, and email.
- `Student(long id, String firstName, String lastName, String email)`: Constructs a new `Student` object with the specified id, first name, last name, and email.
- `Student()`: Default constructor.

### Methods

The class provides getter and setter methods for accessing and modifying the attributes of a `Student` object.

- `getId()`: Retrieves the id of the student.
- `setId(long id)`: Sets the id of the student.
- `getFirstName()`: Retrieves the first name of the student.
- `setFirstName(String firstName)`: Sets the first name of the student.
- `getLastName()`: Retrieves the last name of the student.
- `setLastName(String lastName)`: Sets the last name of the student.
- `getEmail()`: Retrieves the email address of the student.
- `setEmail(String email)`: Sets the email address of the student.

### Usage

The `Student` entity class is used to represent student data within the Student Management System. It is mapped to the `students` table in the database and provides methods for accessing and modifying student information.
