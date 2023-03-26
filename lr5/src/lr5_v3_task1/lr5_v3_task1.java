package lr5_v3_task1;

import java.util.ArrayList;
import java.util.Scanner;

public class lr5_v3_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();

        System.out.println("Введите подстроку для удаления: ");
        String searchString = in.nextLine();

        System.out.println("Введите последовательность строк (пустая строка для завершения ввода):");
        while (true){
            String currentString = in.nextLine();
            if(currentString.isEmpty()){
                break;
            }
            strings.add(currentString);
        }

        for (String string : strings){
            string = string.replace(searchString,"");
            System.out.println(string);
        }
    }
}
