# Employee Management System

A simple Employee Management System built using Spring Boot and Thymeleaf. This web application allows you to perform basic CRUD (Create, Read, Update, Delete) operations on employee records. The project includes two main web pages: the Home page and the Add Employee page, along with facilities to edit and delete employee data.

## Features

- **Home Page**: Displays a list of employees with their details, including ID, name, address, email, phone number, and salary.
- **Add Employee**: A form to add new employee information.
- **Edit Employee**: Allows editing of existing employee information.
- **Delete Employee**: Deletes an employee record from the system.

## Technologies Used

- **Spring Boot**: Backend framework used to build the application.
- **Thymeleaf**: Template engine for rendering the front-end pages.
- **Bootstrap**: For styling the web pages.
- **MySQL**: Used as the database to store employee data.

## Project Structure

- **Controller**: Contains the main logic for handling HTTP requests (e.g., adding, editing, deleting, and fetching employee data).
- **Service**: Includes the business logic for the employee management.
- **Repository**: Provides data access to the database using Spring Data JPA.
- **Templates**: Contains Thymeleaf templates (`HTML` files) for rendering web pages.
- **Static**: Includes static resources like CSS and JavaScript.

## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/prathmesh193/employee-management-system-using-springboot.git
