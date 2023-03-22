package lr4_v2_task1;

public class Encyclopedia extends Book{
    private String volume;

    public Encyclopedia(String code, String title, String author, String publisher, int year, String volume){
        super(code, title, author, publisher, year);
        this.volume= volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год издания: " + year);
        System.out.println("Шифр: " + code);
        System.out.println("Объём: " + volume);
        System.out.println();
    }
}
