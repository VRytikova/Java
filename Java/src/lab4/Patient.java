package lab4;

import java.io.*;

public class Patient {
    protected String surname;
    protected String gender;
    protected String age;
    BufferedReader br=null;
    static File file= null;
    FileWriter fw = null;
    static FileReader fr = null;
    public Patient() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the surname: ");
            this.surname=br.readLine();
        System.out.println("Enter the gender: ");
            this.gender= br.readLine();
        System.out.println("Enter the age: ");
            this.age= br.readLine();
    }

  public void inFile() throws IOException{
        file= new File("C:\\Users\\User\\Documents\\Projects\\lab4.txt");
          fw = new FileWriter(file,true);
          fw.append("Surname: "+surname+" Gender: "+gender+" Age: "+age+"\n");
          fw.close();
  }
  public static void outofFile() throws IOException{
      char buffer[];
      int number;
      buffer = new char[1];
        fr = new FileReader(file);
        do {
            number = fr.read(buffer);
            System.out.print(buffer[0]);
        }while(number==1);
        fr.close();
  }
  public static void women(Patient []array){
        String compare = "Female";
        int women=0;
        int averageAge=0;
        int divider=0;
        for(Patient patient:array){
            if(patient.gender.equalsIgnoreCase(compare)){
                women++;
                divider++;
                int agE = Integer.parseInt(patient.age);
                averageAge=(averageAge+agE)/divider;
            }
        }
      System.out.println("The number of women: "+women+" The average age: "+averageAge);
  }
}




