/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task32;
import java.util.Scanner; 

public class Task32 {


    public String convertCase(String word) {
        return toTitleCase(word);
    }

    public String convertCase(String word, char caseType) {
        caseType = Character.toUpperCase(caseType); // Convert to uppercase for consistency
        switch (caseType) {
            case 'U':  // Uppercase
                return word.toUpperCase();
            case 'L':  // Lowercase
                return word.toLowerCase();
            case 'T':  // Titlecase
                return toTitleCase(word);
            default:
                System.out.println("Error: Invalid case type");
                return word;
        }
    }

    // Helper method to convert a string to title case
    private String toTitleCase(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task32 converter = new Task32();

        // Input word
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        // Input case type
        System.out.println("Please choose the case you want to convert:");
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");
        char caseType = scanner.next().charAt(0);
        System.out.printf("%-34s : %s%n", "\nOriginal word", word);
        System.out.printf("%-34s : %s%n", "Calling the first convertCase method", converter.convertCase(word));
        System.out.printf("%-34s : %s%n", "Calling the second convertCase method", converter.convertCase(word, caseType));

    }
}
