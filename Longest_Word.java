// Write a program that takes a sentence as input and finds the longest word in the sentence. If there are multiple words with the same maximum length, return the first one. Use String class methods and loops to solve the problem.

// Input: Coding is a fun challenge.
// Ouput: challenge

import java.util.Scanner;

public class Longest_Word {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();

        String longestWord = findLongestWord(sentence);
        System.out.println(String.format("%s", longestWord));
        sc.close();
    }

    public static String findLongestWord(String sentence) {
        String words[] = sentence.split(" ");
        String longestWord = "";

        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
