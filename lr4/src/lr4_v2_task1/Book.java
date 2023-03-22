package lr4_v2_task1;

public abstract class Book {
    protected String code,title,author,publisher;
    protected int year;
    public Book(String code, String title, String author, String publisher, int year){
        this.author = author;
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public abstract void print();

}
