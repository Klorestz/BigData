package lr7_v2_task1;

public class Main {
    public static void main(String[] args) {
        String text = "мама радар лотс дарар стол амам";
        StringBuilder result = new StringBuilder();

        String[] words = text.split("\\s");

        for (String word : words){
            String word1 = new StringBuilder(word).reverse().toString();
            for (String word2 : words){
                if(word1.equals(word2)){
                    result.append(word + " - " + word2 + "\n");
                }
            }
        }

        System.out.println(result);
    }
}
