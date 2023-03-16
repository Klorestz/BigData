package lr3_task1_v3;

public class lr3_task1_v3 {
    public static void main(String[] args) {
        TextFile file = new TextFile("example.txt");
        file.addContent("Hello, world!");
        file.currentContent();

        file.setNameOfFile("new_example.txt");
        System.out.println(file);

        file.addContent("\nThis is some additional content.");
        file.currentContent();

        file.deleteContent();
        file.currentContent();
    }
}
