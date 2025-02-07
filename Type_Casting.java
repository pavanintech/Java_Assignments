// Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

// Declare and initialize variables of different primitive data types (int, double, char, and boolean).
// Perform type conversion by converting an int to a double and a char to an int.
// Print the values of all variables before and after the conversions.

import java.util.Scanner;

public class Type_Casting {
    public static void main(String args[]) {
        int intVar = 66;
        double doubleVar = intVar;
        char charVar = 'P';
        int var = charVar;

        System.out.println("Double Variable: " + doubleVar);
        System.out.println("Integer Variable: " + var);
    }
}