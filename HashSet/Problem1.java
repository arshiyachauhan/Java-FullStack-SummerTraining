/*Unique word counter with HashSet- Write a java program that reads a sentence (or a para) from the user . THe program shouyld then
1.Count the total number of words
2. Count the number of unique words using HashSet
3. Print all unique words*/

import java.util.HashSet;
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        HashSet<String> uniqueWords= new HashSet<>();
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        String[] words= input.toLowerCase().split("\\W+");
        // \\W+ matches one or more non-word character , to avoid case-sensitive cases

        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }
        System.out.println("Total number words: " + words.length);
        System.out.println("Number of unique words: " + uniqueWords.size());
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        sc.close();
    }
}
