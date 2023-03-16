package lr3_task1_v4;

import java.util.ArrayList;

public class Course {
    private int id;
    private String NameOfCourse;
    private Teacher teacher;
    private ArrayList<Student> students;
    public Course(int id, String nameOfCourse, Teacher teacher){
        this.id = id;
        this.NameOfCourse = nameOfCourse;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getNameOfCourse() {
        return NameOfCourse;
    }

    @Override
    public String toString() {
        return "id: " + id + " Name of course: " + NameOfCourse;
    }
}
