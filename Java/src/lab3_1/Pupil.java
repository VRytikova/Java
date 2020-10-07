package lab3_1;

public class Pupil extends Learner{
    private int classNumber;
    private char letter;
    public Pupil(String a, String b, String c, int d, int classN, char let){
        super(a,b,c,d);
        this.classNumber= classN;
        this.letter=let;
    }

    public Pupil(String a, String b, int d, int classN, char let){
        super(a,b,d);
        this.classNumber= classN;
        this.letter=let;
    }

    public Pupil(){
        super.surname="Kisel";
        super.name="Yan";
        super.gender="Female";
        super.age=6;
        this.classNumber = 1;
        this.letter='d';
    }

    public int getClassNumber(){
        return classNumber;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Class number: "+getClassNumber()+getLetter());
    }
}
