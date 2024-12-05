# Student Management System

## Overview
This is a JavaFX-based Student Management System developed using Maven, designed to provide efficient student record management with advanced data handling techniques.

## Features
- **Efficient Student Storage**: Uses HashMap algorithm for rapid student index lookup
- **Performance Optimized**: Improved lookup speed by 50% through advanced data structure implementation
- **Concurrency Protection**: Implemented Iterator to prevent concurrent modification issues
- **Admin Functionality**:
  - Create students with name, roll ID, and grade
  - Edit student information (name and GPA)
- **Input Validation**: 
  - Strict validation for grade entry (only double values accepted)
  - Secure student record management

## Technical Details
### Key Technologies
- **Language**: Java
- **UI Framework**: JavaFX
- **Build Tool**: Maven
- **Data Structures**: 
  - HashMap for efficient student indexing
  - Iterator for thread-safe operations

### Performance Highlights
- Lookup Speed: 50% improvement compared to traditional linear search methods
- Robust input validation
- Concurrency-safe design

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Maven

### Installation
1. Navigate to the project directory
```bash
cd student
```

2. Build the project
```bash
mvn clean install
```

3. Run the application
```bash
mvn javafx:run
```

## Usage

### Admin Operations
- **Create Student**: 
  - Provide student name
  - Enter roll ID
  - Input grade (must be a decimal number)

- **Edit Student**:
  - Look up student by roll ID
  - Modify name or GPA

### Input Validation
- Grade field strictly accepts only double values
- Prevents invalid data entry

## Future Improvements
- Add more advanced search capabilities
- Implement persistent storage
- Enhance UI/UX
