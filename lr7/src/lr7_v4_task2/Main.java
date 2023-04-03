package lr7_v4_task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog. The dog is lazy. Dog.";
        String wordsForCount = "fox dog quick lazy";
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = wordsForCount.toLowerCase().split("\\s+");

        for (String word : words){
            wordCount.put(word, 0);
        }

        String[] textWords = text.toLowerCase().split("[^a-z]");

        for (String word : textWords){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        List<Map.Entry<String, Integer>> mappings = new ArrayList<>(wordCount.entrySet());
        Collections.sort(mappings, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<String, Integer> entry : mappings ){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
