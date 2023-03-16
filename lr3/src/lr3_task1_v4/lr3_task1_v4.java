package lr3_task1_v4;

import java.util.ArrayList;
import java.util.Scanner;

public class lr3_task1_v4 {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Course> courses = new ArrayList<Course>();
        Archive archive = new Archive();
        Scanner in = new Scanner(System.in);

        teachers.add(new Teacher(1,"Sidr","Sidorov"));
        teachers.add(new Teacher(2,"Petr", "Petrov"));
        teachers.add(new Teacher(3,"Ivan", "Ivanov"));

        students.add(new Student(1,"Adam", "Adamov"));
        students.add(new Student(2, "Viktor", "Viktorov"));
        students.add(new Student(3, "Danila", "Karasyov"));

        while (true){
            System.out.println("Select role:\n1.Teacher\n2.Student");
            int selected = in.nextInt();
            switch (selected){
                case 1:
                    System.out.println("Choose yourself:");
                    for (Teacher teacher : teachers){
                        System.out.println(teacher.toString());
                    }
                    int SelectedTeacher = in.nextInt();
                    System.out.println("Select task:\n1.Create course registration\n2.Set grade");
                    int SelectedTeacherTask = in.nextInt();
                    switch (SelectedTeacherTask){
                        case 1:
                            System.out.println("Enter name of course:");
                            String NameOfCourse = in.next();
                            Course newCourse = new Course(courses.size(),NameOfCourse, teachers.get(SelectedTeacher-1));
                            courses.add(newCourse);
                            teachers.get(SelectedTeacher-1).createCourseRegistration(newCourse);
                            break;
                        case 2:
                            System.out.println("Select course:");
                            for (Course course : teachers.get(SelectedTeacher-1).getCourses()){
                                System.out.println(course.toString());
                            }
                            int SelectedTeacherCourse = in.nextInt();
                            System.out.println("Select student:");
                            for (Student student : courses.get(SelectedTeacherCourse).getStudents()){
                                System.out.println(student.toString());
                            }
                            int SelectedTeacherStudent = in.nextInt();
                            System.out.println("Grade of student:");
                            int GradeStudent = in.nextInt();
                            teachers.get(SelectedTeacher-1).setGrade(archive, students.get(SelectedTeacherStudent-1), courses.get(SelectedTeacherCourse), GradeStudent);
                            System.out.println("Student's grade is saved");
                            System.out.println("Archive:");
                            archive.printArchiveGrade();
                    }
                    break;
                case 2:
                    System.out.println("Choose yourself:");
                    for (Student student : students){
                        System.out.println(student.toString());
                    }
                    int SelectedStudent = in.nextInt();
                    System.out.println("Select course for registration:");
                    for (Course course: courses){
                        System.out.println(course.toString());
                    }
                    int SelectedStudentCourse = in.nextInt();
                    courses.get(SelectedStudentCourse).addStudent(students.get(SelectedStudent-1));
                    break;
            }
        }
    }
}
