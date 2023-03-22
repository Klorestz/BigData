package lr4_v2_task2;

public class lr4_v2_task2 {
    public static void main(String[] args) {
        String[] schedule = {"Высшая математика", "Физика", "Основы программирования"};
        PartTimeStudent newStudent = new PartTimeStudent("Данила", 18, "МГТУ", schedule, "Информатиа и вычислительная техника");
        newStudent.apply();
        newStudent.study();
    }
}
