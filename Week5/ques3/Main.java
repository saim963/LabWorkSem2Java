package Week5.ques3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        int wordCount = tokenizer.countTokens();
        int sentenceCount = 0;
        int eCount = 0;
        int zCount = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch == 'e') {
                eCount++;
            } else if (ch == 'z') {
                zCount++;
            }
            if (ch == '.' || ch=='!' || ch=='?') {
                sentenceCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of 'e' characters: " + eCount);
        System.out.println("Number of 'z' characters: " + zCount);
        sc.close();
    }
}
