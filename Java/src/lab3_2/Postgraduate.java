package lab3_2;

public class Postgraduate implements Object, Learner {
    private String surname;
    private String name;
    private int age;
    private String project;
    private String tutor;

    public Postgraduate(String surname, String name, int age, String project, String tutor){
        this.surname=surname;
        this.name=name;
        this.age=age;
        this.project=project;
        this.tutor=tutor;
    }

    public String getSurname() {
        return surname;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProject() {
        return project;
    }

    public String getTutor() {
        return tutor;
    }

    @Override
    public void printCategory() {
        System.out.println("Postgraduates: ");
    }
    @Override
    public void displayInfo() {
        System.out.println("Surname: "+getSurname()+" Name: "+getName()+" Age: "+getAge()+" Project: "+getProject()+" Tutor: "+getTutor());
    }

}
