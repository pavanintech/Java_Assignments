// Write a Java program to calculate the grade of a student based on their marks using if-else conditional statements. The program should follow these criteria:

// Marks >= 90: Grade A
// Marks >= 80 and < 90: Grade B
// Marks >= 70 and < 80: Grade C
// Marks >= 60 and < 70: Grade D
// Marks < 60: Grade F
// The program should:

// Take the marks as input from the command line.
// Validate the input to ensure it is a positive integer between 0 and 100.
// Display the appropriate grade based on the marks.

import java.util.Scanner;

public class Grade_System {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        char grade;

        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Your Grade: " + grade);

        sc.close();
    }
}