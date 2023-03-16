package lr3_task1_v4;

import java.util.ArrayList;

public class Student {
    private int id;
    private String firstName, lastName;
    private ArrayList<Course> courses;
    private ArrayList<Grade> grades;
    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<Course>();
        this.grades = new ArrayList<Grade>();
    }

    public void getAvailableCourses(ArrayList<Course> Courses){
        for (Course course : Courses){
            System.out.println(course.toString());
        }
    }

    public void registrationOnCourse(Course currentCourse){
        currentCourse.addStudent(this);
    }

    public void getListOfGrades(){
        for (Grade grade : grades){
            System.out.println(grade.toString());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Lastname: " + lastName + " Firstname: " + firstName;
    }
}
