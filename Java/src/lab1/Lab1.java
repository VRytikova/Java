package lab1;

public class Lab1 {
    public static void main (String[] arg){
 Patient patient1 = new Patient();
 /*Patient patient2 = new Patient();*/
        patient1.setSurname("Rytikova");
        patient1.setGender("Female");
        patient1.setAge(18);
        int k = patient1.getAge();
        System.out.println("Age: "+k);
        patient1.displayInfo();
    }
}
