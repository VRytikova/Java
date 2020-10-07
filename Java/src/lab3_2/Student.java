package lab3_2;

public abstract class Student implements Learner,Object{
    protected String surname;
    protected String name;
    protected int age;
    protected String faculty;
    protected String speciality;
    protected int group;
    protected String educationForm;

    public Student(String surname, String name, int age, String faculty, String speciality, int group, String educationForm){
        this.surname=surname;
        this.name=name;
        this.age=age;
        this.faculty=faculty;
        this.speciality=speciality;
        this.group=group;
        this.educationForm=educationForm;
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

    public String getFaculty(){
        return faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getGroup() {
        return group;
    }

    public String getEducationForm() {
        return educationForm;
    }
    public abstract void printCategory();
    public abstract void displayInfo();
}
