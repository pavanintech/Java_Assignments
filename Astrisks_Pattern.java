// Problem Description:
// Write a program to print a diamond pattern of asterisks (*) with a given number of rows.

// Input: n = 5
// Output:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *

// Explanation:
// The pattern consists of two parts: the upper half and the lower half. The upper half has n rows, and the lower half has n-1 rows. Each row contains spaces followed by asterisks.

import java.util.*;

public class Astrisks_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int p = 0; p < i*2+1; p++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            int spaces = i + 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int p = 0; p < (n-i-2)*2+1; p++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
