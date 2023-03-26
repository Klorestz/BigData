package lr5_v2_task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class lr5_v2_task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentArray studentArray = new StudentArray();

        System.out.println("Введите кол-во студентов: ");
        String input = in.nextLine();

        try {
            Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            System.out.println("Ошибка: введенное значение не является целым числом");
        }

        for (int i=0; i<Integer.parseInt(input); i++){
            System.out.println("Введите имя, фамилию, отчество студента:");
            String lastName = in.nextLine();
            String name = in.nextLine();
            String middleName = in.nextLine();
            System.out.println("Введите дату рождения в формате yyyy-MM-dd:");
            String dateStr = in.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            try {
                LocalDate.parse(dateStr, formatter);
            }
            catch (DateTimeParseException e){
                System.out.println("Ошибка: введенное значение не является датой формата yyyy-MM-dd");
            }
            System.out.println("Введите телефон студента:");
            String telephone = in.nextLine();
            System.out.println("Введите Факультет, курс, группу студента");
            String faculty = in.nextLine();
            String coure = in.nextLine();
            String group = in.nextLine();
            try {
                Integer.parseInt(coure);
                Integer.parseInt(group);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: непаравильно указана группа или курс студента");
            }
            studentArray.addStudent(new Student(lastName,name,middleName,LocalDate.parse(dateStr, formatter),"Moscow",telephone,faculty,Integer.parseInt(coure),Integer.parseInt(group)));

        }

        System.out.println("Полный список студентов");
        studentArray.printAllStudents();
        System.out.println();
        System.out.println("Список студентов факультета Математики");
        studentArray.printStudentsCurrentFaculty("Математика");
        System.out.println();
        System.out.println("Список студентов по всем курсам и факультетам");
        studentArray.printStudentsByFacultyAndCourse();
        System.out.println();
        System.out.println("Список студентов, рождённых после определённой даты");
        studentArray.printStudentsBirthAfterDate(LocalDate.of(2000, 4, 1));
        System.out.println("Учебная группа");
        studentArray.printStudentsCurrentlyGroup(3, 201, "Physics");
    }
}
