package lab3;

public class Learner {
    protected String surname;
    protected String name;
    protected String gender;
    protected int age;

    public Learner(String a, String b, String c, int d){
        this.surname=a;
        this.name=b;
        this.gender=c;
        this.age=d;
    }

    public Learner(String a, String b, int d){
        this.surname=a;
        this.name=b;
        this.age=d;
    }

    public Learner(){

    }
     public String getSurname() {
        return surname;
     }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void displayInfo(){
        System.out.println("Surname: "+getSurname()+ " Name: "+getName()+ " Gender: "+getGender()+" Age: "+getAge());
    }
}
