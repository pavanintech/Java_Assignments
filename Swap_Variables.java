// Problem Description:
// Write a program to swap two integer variables without using a temporary variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

// Explanation:
// The program swaps the values of a and b using arithmetic or bitwise operations, resulting in a being 10 and b being 5.

import java.util.Scanner;

public class Swap_Variables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two variables: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before Swap:: a: " + a + ", b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:: a: " + a + ", b: " + b);

        sc.close();
    }
}
