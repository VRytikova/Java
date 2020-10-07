package lab2;

public class Patient {
    private String surname;
    private String gender;
    private int age;

    public Patient(String a,String b, int c){
        this.surname = a;
        this.gender = b;
        this.age=c;
    }

    public Patient(String a, String b){
        this.surname=a;
        this.gender=b;
    }

    public Patient(String a, int c){
        surname=a;
        age=c;
    }

    public static int averageAge(Patient []patients){
        int av = 0;
        for(int i=0;i<3;i++){
            av+=patients[i].age;
            if(i==2) {
                av = av/3;
            }
        }
        return av;
    }

    public static int women(Patient []patients){
        int number=0;
        String comparison="Female";
        for(int i=0;i<3;i++) {
            boolean value=comparison.equals(patients[i].gender);
            if (value) number++;
        }
        return number;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Surname: "+getSurname()+ " Gender:"+getGender()+ " Age: "+getAge());
    }
}
