package lab3_1;

public class Postgraduate extends Learner {
    private String project;
    private String tutor;

    public Postgraduate(String a, String b, String c, int d, String pr, String tut){
        super(a,b,c,d);
        this.project=pr;
        this.tutor=tut;
    }

    public Postgraduate(String a, String b,  int d, String pr, String tut){
        super(a,b,d);
        this.project=pr;
        this.tutor=tut;
    }

    public Postgraduate(){
        super.surname="Pylnik";
        super.name="Marina";
        super.gender="Female";
        super.age=25;
        this.project="Marketing in electricity";
        this.tutor="Kobrinec Nikolai";
    }

    public String getProject() {
        return project;
    }

    public String getTutor() {
        return tutor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    System.out.println(" Project: "+getProject()+" Tutor: "+getTutor());
    }
}
