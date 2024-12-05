# Student Grade Calculator

## Project Description

This is a simple Java program that calculates a student's academic performance by tracking grades across multiple subjects.

## Features

- Create an array of subjects
- Interactively input grades for each subject
- Calculate total marks
- Compute average percentage
- Determine letter grade based on performance

## How It Works

### Grade Calculation Process

1. **Subject Array**: An array of subjects is created to track the student's classes.
2. **Grade Input**: The program uses a for loop to cycle through each subject, prompting the user to enter a grade.
3. **Total Marks**: All grades are summed up to calculate total marks.
4. **Average Calculation**: The average is computed using the formula:
   ```java
   double average = (double) totalmarks / (double) subjects.length;
   ```

### Grading Scale

- **A**: Above 90%
- **B**: 80% - 89%
- **C**: 70% - 79%

## Output

The program displays:
- Total marks
- Average percentage
- Corresponding letter grade

## Example

```
Enter grade for Math: 85
Enter grade for Science: 92
Enter grade for English: 78
...

Total Marks: 255
Average: 85%
Letter Grade: B
```

## Potential Improvements

- Add more grade letter categories
- Implement error handling for invalid grade inputs
- Create a more sophisticated grading scale

## Requirements

- Java Development Kit (JDK)
- Console/Terminal to run the program

## How to Run

1. javac studentgrade.java
2. java studentgrade
3. Follow the on-screen prompts to enter grades
