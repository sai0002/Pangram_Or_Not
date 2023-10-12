import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        boolean isPangram = checkIfPangram(sentence);

        if (isPangram)
            System.out.println("The input is a pangram.");
        else
            System.out.println("The input is not a pangram.");
    }

    private static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();

        // Add all the alphabets to the set
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }

        // Check if each letter of the alphabet is present in the input sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.remove(c);
            }
        }

        // If the set is empty, it's a pangram
        return alphabetSet.isEmpty();
    }
}

