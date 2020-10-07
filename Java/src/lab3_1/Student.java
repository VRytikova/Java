package lab3_1;

public class Student extends Learner {
    private String faculty;
    private String speciality;
    private int group;

    public Student(String a, String b, String c, int d, String fac, String spec, int g){
        super(a,b,c,d);
        this.faculty=fac;
        this.speciality=spec;
        this.group=g;
    }

    public Student(String a, String b, int d, String fac, String spec, int g){
        super(a,b,d);
        this.faculty=fac;
        this.speciality=spec;
        this.group=g;
    }

    public Student(){
        super.surname="Smotritskaya";
        super.name="Varvara";
        super.gender="Female";
        super.age=18;
        this.faculty="Engineering and Economics";
        this.speciality="Digital marketing";
        this.group = 974001;
    }

    public String getFaculty(){
        return faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Faculty: "+getFaculty()+" Speciality: "+getSpeciality()+" Group: "+getGroup());
    }
}
