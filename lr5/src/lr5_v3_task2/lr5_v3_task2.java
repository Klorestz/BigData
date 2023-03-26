package lr5_v3_task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lr5_v3_task2 {
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;
        String oldSubstr = "фонарь"; // заданная подстрока
        String newSubstr = "лампа"; // заменяемая подстрока
        ArrayList<String> strings = new ArrayList<String>();

        if (args.length == 2){
            inputFileName = args[0];
            outputFileName = args[1];
        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя входного файла: ");
            inputFileName = scanner.nextLine();
            System.out.print("Введите имя выходного файла: ");
            outputFileName = scanner.nextLine();
            scanner.close();
        }

        Scanner input;
        FileWriter output;
        try {
            input = new Scanner(new File(inputFileName));
            output = new FileWriter(new File(outputFileName));
        }
        catch (FileNotFoundException e){
            System.out.println("Один из файлов не найден.");
            return;
        }
        while (input.hasNextLine()){
            strings.add(input.nextLine());
        }
        input.close();
        System.out.println("Исходное стихотворение:");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println();
        System.out.println("Результат работы программы:");
        for (String string: strings){
            string = string.replace(oldSubstr, newSubstr);
            output.write(string + System.lineSeparator());
            System.out.println(string);
        }
        output.close();
    }
}
