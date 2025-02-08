// You are managing a system that uses a 4-bit permission scheme to represent the access rights of a user. Each bit represents a specific permission:

// Bit 3 (from left): Read
// Bit 2: Write
// Bit 1: Execute
// Bit 0 (from left): Delete
// Write a program that:

// Takes a 4-bit integer (0–15) as the current permissions.
// Takes a bit position (0 to 3) as input and toggles (reverses) the bit at that position using bitwise operators.
// Displays the new permission set after toggling the bit.

// Input:
// Enter current permissions (0-15): 10
// Enter the bit position to toggle (0-3): 2

// Output:
// Original permissions: 1010
// Updated permissions: 1110
import java.util.Scanner;

public class Bit_Updation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current permissions (0-15): ");
        int curr_per = sc.nextInt();
        System.out.print("Enter the bit position to toggle (0-3): ");
        byte b_pos = sc.nextByte();

        System.out.print("Original permissions: ");
        System.out.print(String.format("%4s", Integer.toBinaryString(curr_per)).replace(' ', '0'));
        // int temp = curr_per;
        // while (temp > 0) {
        //     System.out.print(temp & 1);
        //     temp = (temp >> 1);
        // }

        curr_per = curr_per ^ (1 << b_pos);
        System.out.print("\nUpdated permissions: ");
        System.out.print(String.format("%4s", Integer.toBinaryString(curr_per)).replace(' ', '0'));
        // temp = curr_per;
        // while (temp > 0) {
        //     System.out.print(temp & 1);
        //     temp = temp >> 1;
        // }
        System.out.println();

        sc.close();
    }
}
