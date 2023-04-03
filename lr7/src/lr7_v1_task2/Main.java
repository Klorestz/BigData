package lr7_v1_task2;

public class Main {
    public static void main(String[] args) {
        String text = "Добрый день, ребята";
        StringBuilder result = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);
            if (Character.isLetter(currentChar)){
                int num = Character.toLowerCase(currentChar) - 'а' + 1;
                result.append(currentChar).append("  ");
                numbers.append(num).append(" ");
            }
        }

        System.out.println(result);
        System.out.println(numbers);
    }
}
