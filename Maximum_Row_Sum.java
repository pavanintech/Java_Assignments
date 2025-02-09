// Write a Java program to find the row with the maximum sum in a 2D array.

// Input the number of rows and columns in the array.
// Take user input to populate the 2D array.
// Use a for-each loop to iterate over the array and calculate the sum of each row.
// Print the row number (1-based indexing) and the corresponding sum of the row with the maximum sum.

// Input:
// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12

// Output:
// Row with the maximum sum: 3
// Maximum sum: 42

import java.util.Scanner;

public class Maximum_Row_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_value = Integer.MIN_VALUE;
        int row_id = 0;
        for (int i = 0; i < rows; i++) {
            int row_sum = 0;
            for (int j = 0; j < cols; j++) {
                row_sum += arr[i][j];
            }
            if (max_value < row_sum) {
                row_id = i+1;
                max_value = row_sum;
            }
        }

        System.out.println("Row Id: " + row_id);
        System.out.println("Max. Row Sum: " + max_value);

        sc.close();
    }
}
