package lr3_task1_v4;

import lr3_task11_v3.Day;

import java.util.ArrayList;
import java.util.Objects;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;
    public Teacher(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<Course>();
    }
    public void createCourseRegistration(Course course){
        courses.add(course);
    }
    public void setGrade(Archive archive, Student student, Course course, int grade){
        Grade newGrade = new Grade(this, course, student, grade);
        student.getGrades().add(newGrade);
        archive.addGrade(newGrade);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Lastname: " + lastName + " Firstname: " + firstName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return firstName.equals(teacher.firstName) && lastName.equals(teacher.lastName);
    }
}
