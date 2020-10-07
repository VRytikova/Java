package lab3_2;

public class Pupil implements Learner,Object {
    private String surname;
    private String name;
    private int age;
    private int classNumber;
    private char letter;

    public Pupil(String surname, String name, int age, int classNumber, char letter){
        this.surname=surname;
        this.name=name;
        this.age=age;
        this.classNumber=classNumber;
        this.letter=letter;
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

    public int getClassNumber() {
        return classNumber;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public void printCategory() {
        System.out.println("Pupils: ");
    }

    @Override
    public void displayInfo() {
        System.out.println("Surname: "+getSurname()+" Name: "+getName()+" Age: "+getAge()+" Class: "+getClassNumber()+getLetter());
    }

}
