package lab1;

public class Lab1 {
    public static void main (String[] arg){
 Patient patient1 = new Patient("Rytikova","Female",18);
 Patient patient2 = new Patient("Pchelnik","Male", 30);
        String k = patient1.getSurname();
        System.out.println("Show info about patient "+k);
        patient1.displayInfo();

        k = patient2.getSurname();
        System.out.println("Show info about patient "+k);
        patient2.displayInfo();
    }
}
