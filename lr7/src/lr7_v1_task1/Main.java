package lr7_v1_task1;

public class Main {
    public static String replaceKthLetter(String text, int k, char replacement){
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            if (word.length() >= k){
                result.append(word.replace(word.charAt(k-1),replacement)).append(" ");
            }
            else {
                result.append(word).append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String text = "This is a test text";
        int k = 3;
        char replacement = '*';
        String replacedText = replaceKthLetter(text, k, replacement);
        System.out.println(replacedText);
    }
}
