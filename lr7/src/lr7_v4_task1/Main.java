package lr7_v4_task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "All the world's a stage, and all the men and women merely players. "
                + "They have their exits and their entrances, and one man in his time plays many parts. "
                + "As You Like It, Act II, Scene VII.";
        List<String> words = getWords(text);
        char letter = 'e';
        sortByLetter(words, letter);
        System.out.println(words);
    }

    private static List<String> getWords(String text) {
        String[] wordsArr = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().trim().split("\\s+");
        return new ArrayList<>(Arrays.asList(wordsArr));
    }

    private static int countLetter(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    private static void sortByLetter(List<String> words, char letter) {
        Comparator<String> letterCountComparator = new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int count1 = countLetter(word1, letter);
                int count2 = countLetter(word2, letter);
                if (count1 == count2) {
                    return word1.compareTo(word2);
                }
                return Integer.compare(count1, count2);
            }
        };
        Collections.sort(words, letterCountComparator);
    }
}
