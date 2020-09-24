package lab1;

public class Patient {
    private String surname;
    private String gender;
    private int age;

    public Patient(String a,String b, int c){
        surname = a;
        gender = b;
        age=c;
    }

    public String getSurname(){
         return surname;
    }

    public String getGender(){
         return gender;
    }

    public int getAge(){
         return age;
    }

    public void displayInfo(){
         System.out.println("Surname: "+getSurname()+ " Gender:"+getGender()+ " Age: "+getAge());
    }

}
