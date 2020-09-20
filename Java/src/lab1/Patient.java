package lab1;

public class Patient {
    private String surname;
    private String gender;
    private int age;
     public void setSurname(String surname){
         this.surname = surname;
     }

     public void setGender(String gender){
         this.gender = gender;
     }

     public void setAge(int age){
         this.age = age;
     }

    /*public String getSurname(){
         return surname;
    }

    public String getGender(){
         return gender;
    }*/

    public int getAge(){
         return age;
    }

    public void displayInfo(){
         System.out.println("Surname: "+surname+ " Gender:"+gender+ " Age: "+age);
    }

}
