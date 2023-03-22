package lr4_v2_task2;

import java.util.ArrayList;
import java.util.Arrays;

public class PartTimeStudent extends Student{
    private String[] schedule;
    private String specialization;
    public PartTimeStudent(String name, int age, String university, String[] schedule, String specialization){
        super(name, age, university);
        this.schedule = schedule;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String[] getSchedule() {
        return schedule;
    }

    @Override
    public void apply() {
        System.out.println("Форма подачи документов студента: " + Name + " - заочная");
    }

    @Override
    public void study() {
        System.out.println("Специальность студента: " + specialization);
        System.out.println("Расписание студента: " + Arrays.toString(schedule));
    }
}
