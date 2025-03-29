import java.util.Scanner;

public class VowelsAndConsonantsEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sentences:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] sentences = new String[n];

        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        for (String sentence : sentences) {
            findVowelsAndConsonants(sentence);
        }
    }

    public static void findVowelsAndConsonants(String sentence) {
        String vowels = "AEIOUaeiou";
        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("  Vowels: " + vowelCount);
        System.out.println("  Consonants: " + consonantCount);
    }
}