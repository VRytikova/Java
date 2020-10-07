package lab3_2;

public class Daily extends Student {
    public Daily(String surname, String name, int age, String faculty, String speciality, int group, String educationForm){
        super(surname, name, age, faculty,speciality, group,educationForm);
    }

    @Override
    public void printCategory() {
        System.out.println("Students, who study daily: ");
    }

    @Override
    public void displayInfo() {
        System.out.println("Surname: "+getSurname()+" Name: "+getName()+" Age: "+getAge()+" Faculty: " +getFaculty()+" Speciality: "+getSpeciality()+" Group: "+getGroup()+" Education form: "+getEducationForm());
    }
}
