package lr7_v3_task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vel ligula eget ipsum blandit ultrices vel vel dolor. Duis porttitor tincidunt lectus, eget tincidunt eros tempus at. Aliquam pharetra, elit vel sollicitudin bibendum, urna enim feugiat leo, vel vestibulum sem nulla sed nulla. Sed vel ex ut orci tincidunt dapibus ut non velit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Sed tristique turpis et enim pulvinar, vel ornare neque elementum. Vestibulum eu hendrerit arcu. Fusce venenatis elit et augue varius, vel pulvinar dolor eleifend. Nam euismod bibendum diam, non convallis turpis laoreet a.";
        List<String> sentencesWithRepeat = new ArrayList<String>();
        int countOfSentences = 0;

        String[] sentences = text.split("[.!?]\\s");

        for (String sentence : sentences){
            Set<String> uniqueWord = new HashSet<>();
            List<String> wordSentence = Arrays.asList(sentence.replaceAll("[^a-zA-Z ]", "").split(" "));
            uniqueWord.addAll(wordSentence);
            if(wordSentence.size() != uniqueWord.size()){
                sentencesWithRepeat.add(sentence);
                countOfSentences++;
            }
        }

        System.out.println("Count of sentences: " + countOfSentences);

        for (String sentence : sentencesWithRepeat){
            System.out.println(sentence);
        }
    }
}
