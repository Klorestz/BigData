package lr3_tas1_v2;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Student {
    private static int Counter = 0;
    private int id, Course, Group;
    private String LastName, FirstName, Patronymic, Address, Telephone, Faculty;
    private LocalDate DateOfBirthday;
    public Student( String lastName, String firstName, String middleName, LocalDate birthDate, String address, String phone, String faculty, int course, int group) {
        this.id = Counter++;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.Patronymic = middleName;
        this.DateOfBirthday = birthDate;
        this.Address = address;
        this.Telephone = phone;
        this.Faculty = faculty;
        this.Course = course;
        this.Group = group;
    }
    //getters
    public String getLastName(){
        return this.LastName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getAddress(){
        return this.Address;
    }
    public String getTelephone(){
        return this.Telephone;
    }
    public String getPatronymic(){
        return this.Patronymic;
    }
    public String getFaculty(){
        return this.Faculty;
    }
    public int getCourse(){
        return this.Course;
    }
    public int getGroup(){
        return this.Group;
    }
    public LocalDate getDateOfBirthday(){
        return this.DateOfBirthday;
    }
    public int getId(){
        return this.id;
    }
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setAddress(String address) {
        this.Address = Address;
    }
    public void setCourse(int course) {
        this.Course = course;
    }
    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.DateOfBirthday = dateOfBirthday;
    }
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }
    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setGroup(int group) {
        Group = group;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + LastName + '\'' +
                ", firstName='" + FirstName + '\'' +
                ", middleName='" + Patronymic + '\'' +
                ", birthDate=" + DateOfBirthday +
                ", address='" + Address + '\'' +
                ", phone='" + Telephone + '\'' +
                ", faculty='" + Faculty + '\'' +
                ", course=" + Course +
                ", group='" + Group + '\'' +
                '}';
    }
}
