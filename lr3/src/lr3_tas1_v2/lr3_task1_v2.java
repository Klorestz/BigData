package lr3_tas1_v2;

import java.time.LocalDate;

public class lr3_task1_v2 {
     public static void main(String[] args) {
         StudentArray studentArray = new StudentArray();
         studentArray.addStudent(new Student( "Ivanov", "Ivan", "Ivanovich", LocalDate.of(2000, 5, 1), "Moscow", "123456789", "Mathematics", 2, 101));
         studentArray.addStudent(new Student( "Petrov", "Petr", "Petrovich", LocalDate.of(1999, 3, 15), "Moscow", "987654321", "Physics", 3, 201));
         studentArray.addStudent(new Student( "Sidorov", "Sidor", "Sidorovich", LocalDate.of(2001, 7, 20), "St. Petersburg", "555555555", "Mathematics", 1, 101));
         studentArray.addStudent(new Student( "Kuznetsov", "Igor", "Igorevich", LocalDate.of(1998, 12, 10), "Moscow", "111111111", "Physics", 3, 202));
         System.out.println("Full list of students");
         studentArray.printAllStudents();
         System.out.println();
         System.out.println("List of students of the faculty of Mathematics");
         studentArray.printStudentsCurrentFaculty("Mathematics");
         System.out.println();
         System.out.println("List of students by all courses and faculty");
         studentArray.printStudentsByFacultyAndCourse();
         System.out.println();
         System.out.println("List of students born after a given year");
         studentArray.printStudentsBirthAfterDate(LocalDate.of(2000, 4, 1));
         System.out.println("Study group list");
         studentArray.printStudentsCurrentlyGroup(3, 201, "Physics");
    }
}
