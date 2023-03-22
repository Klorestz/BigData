package lr4_v2_task2;

public abstract class Student implements Applicant{
    protected String Name;
    protected int age;
    protected String university;
    public Student(String name, int age, String university){
        this.Name = name;
        this.age = age;
        this.university = university;
    }

    public abstract void study();
}
