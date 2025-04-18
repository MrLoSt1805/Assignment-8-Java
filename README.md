# Student Data Entry Java Application

## Author Info
- **Name**: Daniel John Jacob  
- **PRN**: 23070126027  
- **Batch**: AIML A2  

---

## Overview

This is a modular Java application developed to manage student data effectively. It includes functionality to add new student records, display all stored records, and search for a student by their PRN. The application uses custom exceptions to ensure input validation and robust error handling.

---

## Features

- Add new student records  
- Display all student data  
- Search for a student using PRN  
- Input validation using custom exceptions  
- Modular and object-oriented code design  

---

## Project Structure

### 1. `Main.java`
**Functionality**:
- Displays the user menu  
- Accepts user input for menu navigation  
- Calls appropriate methods from `StudentOperations`  
- Handles invalid menu choices using `InvalidChoiceException`  

---

### 2. `Student.java`
**Attributes**:
- `name`: Student's full name  
- `prn`: Unique PRN (Personal Registration Number)  
- `department`: Student's academic department  

**Functionality**:
- Represents each student as an object  
- Uses getter and setter methods to manage data  

---

### 3. `StudentOperations.java`
**Functionality**:
- Maintains a collection of student records (e.g., ArrayList)  
- `addStudent()`: Adds a new student to the collection  
- `displayStudents()`: Prints all student records  
- `searchStudentByPRN(String prn)`: Finds a student by PRN  

---

### 4. `InvalidStudentDataException.java`
**Use Case**:  
Thrown when student input fields are missing or improperly formatted (e.g., empty PRN or name)  

---

### 5. `InvalidChoiceException.java`
**Use Case**:  
Thrown when the user selects an invalid option from the menu  

---


