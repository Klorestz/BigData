package lr4_v2_task1;

public class Guide extends Book{
    private String thematic;
    public Guide(String code, String title, String author, String publisher, int year, String thematic){
        super(code, title, author, publisher, year);
        this.thematic = thematic;
    }

    public String getThematic() {
        return thematic;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год издания: " + year);
        System.out.println("Шифр: " + code);
        System.out.println("Тематика: " + thematic);
        System.out.println();
    }
}
