package lab1;
import lab2.Patient;

public class Lab1 {
    public static void main (String[] arg){
        Patient []patients=new Patient[3];
        patients[0]=new Patient("Rytikov", "Male",22);
        patients[1]=new Patient("Kolikova", "Female");
        patients[2]=new Patient("Kotlov",14);

        for(int i=0;i<3;i++){
            patients[i].displayInfo();
        }

        System.out.println("The average age is "+Patient.averageAge(patients));
        System.out.println("The number of women is "+Patient.women(patients));
    }
}
