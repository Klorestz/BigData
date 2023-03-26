package lr5_v2_task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentArray {
    private ArrayList<Student> studentList;
    public StudentArray(){
        studentList = new ArrayList<Student>();
    }
    public void addStudent(Student S){
        studentList.add(S);
    }

    public void printStudentById(int id) {
        try {
            Student student = findStudentById(id);
            System.out.println(student.toString());
        } catch (StudentNotFoudnException e) {
            System.out.println(e.getMessage());
        }
    }

    public Student findStudentById(int id) throws StudentNotFoudnException {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new StudentNotFoudnException("Студент с id " + id + " не найден.");
    }

    public void printAllStudents(){
        for (Student student : studentList){
            System.out.println(student.toString());
        }
    }
    public void printStudentsCurrentFaculty(String Faculty){
        for (Student student: studentList){
            if(student.getFaculty().equals(Faculty)){
                System.out.println(student.toString());
            }
        }
    }
    public void printStudentsByFacultyAndCourse() {
        ArrayList ListOfFaculty = new ArrayList<String>();
        ArrayList ListOfCourse = new ArrayList<String>();
        for (Student student : studentList) {
            if (!(ListOfFaculty.contains(student.getFaculty())) || !(ListOfCourse.contains(student.getCourse()))){
                System.out.println(student.getFaculty() + ", Course " + student.getCourse() + ":");
                for (Student s : studentList) {
                    if (s.getFaculty().equals(student.getFaculty()) && s.getCourse() == student.getCourse()) {
                        System.out.println(s);
                    }
                }
                System.out.println();
            }
            ListOfFaculty.add(student.getFaculty());
            ListOfCourse.add(student.getCourse());
        }
    }
    public void printStudentsBirthAfterDate(LocalDate DateOfBirth){
        for (Student student: studentList){
            if (student.getDateOfBirthday().isAfter(DateOfBirth)){
                System.out.println(student.toString());
            }
        }
    }
    public void printStudentsCurrentlyGroup(int Course,int Group, String Faculty){
        for (Student student: studentList){
            if (student.getGroup() == Group && student.getCourse() == Course && student.getFaculty() == Faculty){
                System.out.println(student.toString());
            }
        }
    }
}
