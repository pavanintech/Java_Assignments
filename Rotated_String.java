// Write a program to check if one string is a rotation of another string. A string
// S2 is a rotation of S1 if it can be obtained by moving some leading characters of
// S1 to its end, while keeping the order of characters intact.

// Input: S1 = ""coding""
// S2 = ""ingcod""

// Output: true

import java.util.Scanner;

public class Rotated_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S1: ");
        String s1 = sc.nextLine();
        System.out.print("S2: ");
        String s2 = sc.nextLine();

        System.out.println(isStringRotated(s1, s2));
        sc.close();
    }
    public static boolean isStringRotated(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2) return false;

        return (s2 + s2).contains(s1);
    }
}
