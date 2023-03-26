package lr5_v4_task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class lr5_v4_task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner inputFile;
        FileWriter outputFile;

        File directory = new File("lr5_v4_task2");
        if(!directory.exists()){
            directory.mkdirs();
        }

        File input = new File(directory,"input.txt");
        File output = new File(directory,"output.txt");
        if(!input.exists() && !output.exists()){
            try {
                input.createNewFile();
                output.createNewFile();
            }
            catch (IOException e){
                System.out.println("IOException");
            }

        }

        try {
            inputFile = new Scanner(input);
            outputFile = new FileWriter(output);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return;
        }

        while (inputFile.hasNextLine()){
            strings.add(inputFile.nextLine());
        }

        for (String string : strings){
            outputFile.write((new StringBuilder(string).reverse().toString()) + System.lineSeparator());
        }
        outputFile.close();
    }
}

