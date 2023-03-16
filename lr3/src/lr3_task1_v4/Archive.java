package lr3_task1_v4;

import java.util.ArrayList;

public class Archive {
    private ArrayList<Grade> ListOfGrage;
    public Archive(){
        this.ListOfGrage = new ArrayList<Grade>();
    }
    public void addGrade(Grade grade){
        ListOfGrage.add(grade);
    }

    public void printArchiveGrade(){
        for(Grade grade : ListOfGrage){
            System.out.println(grade.toString());
            System.out.println();
        }
    }
}
