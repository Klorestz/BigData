package lr7_v3_task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "собака лампа авто фонарь облако";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(text.split(" ")));
        ArrayList<String> MaxChains = new ArrayList<String>();
        int maxsize = 0;

        for (int i = 0; i < words.size(); i++){
            ArrayList<String> copyWords = new ArrayList<String>();
            copyWords.addAll(words);
            String currentWordOfChains = copyWords.get(i);

            ArrayList<String> currentChains = new ArrayList<String>();
            currentChains.add(currentWordOfChains);
            copyWords.remove(currentWordOfChains);

            int currentWordNumber = 0;
            while (currentWordNumber < copyWords.size()){
                String currentWord = copyWords.get(currentWordNumber);
                if(currentWordOfChains.charAt(currentWordOfChains.length()-1) == currentWord.charAt(0)){
                    copyWords.remove(currentWord);
                    currentWordOfChains = currentWord;
                    currentChains.add(currentWordOfChains);
                    currentWordNumber = 0;
                }
                currentWordNumber++;
            }

             if (currentChains.size() > maxsize){
                 MaxChains = currentChains;
                 maxsize = currentChains.size();
             }

        }

        System.out.println(MaxChains);
    }
}
