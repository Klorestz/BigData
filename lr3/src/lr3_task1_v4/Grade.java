package lr3_task1_v4;

public class Grade {
    private Teacher teacher;
    private Course course;
    private Student student;
    private int grade;
    public Grade(Teacher teacher, Course course, Student student, int grade){
        this.course = course;
        this.teacher = teacher;
        this.student = student;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Lastname of Teacher: " + teacher.getLastName() +
                "\nName of Course: " + course.getNameOfCourse() +
                "\nLastname of student: " + student.getLastName() +
                "\nGrade: " + grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
