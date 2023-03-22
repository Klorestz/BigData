package lr4_v2_task1;

public class lr4_v2_task1 {
    public static void main(String[] args) {
        Encyclopedia encyclopedia = new Encyclopedia("ISBN-10: 2-266-11156-6", "Космос", "Галилео Галилей", "Умка",2002,"650 страниц");
        Guide guide = new Guide("ISBN-10: 2-266-134236-6", "Джунгли", "Автор Авторов", "Умка",2002,"Выживание");
        encyclopedia.print();
        guide.print();
    }
}
