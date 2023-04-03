package lr7_v2_task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "кот кот собака мышь мышь мышь лошадь лошадь лошадь лошадь";
        Map<String , Integer> wordCount = new HashMap<>();

        String[] words = text.split("\\s");

        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else {
                wordCount.put(word, 1);
            }
        }

        wordCount.forEach((key, value) -> {
            System.out.println(key + " - " + value + " раз(а)");
        });
    }
}
