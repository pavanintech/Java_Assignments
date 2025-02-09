// Write a program that reverses the digits of a given integer. The program should handle negative integers correctly and return the reversed integer. If the reversed integer overflows the 32-bit signed integer range, return 0.

// Input: N = 123

// Output: 321

// Input 2: N = -456

// Output 2: -654

import java.util.Scanner;

public class Reverse_Integer {
    public static int reverse(int n) {
        int rev = 0;
        
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = sc.nextInt();
        
        int r = reverse(n);
        System.out.println("Reverse Value: " + r);
        sc.close();
    }
}
