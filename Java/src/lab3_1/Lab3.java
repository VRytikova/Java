package lab3_1;

public class Lab3 {
    public static void main(String[]args){
        Pupil pupil1 = new Pupil("Lobko", "Kate", "Female", 14, 9, 'b');
        Pupil pupil2 = new Pupil("Golovah","Kirill",17,11,'a' );
        Pupil pupil3 = new Pupil();
        System.out.println("Pupils: ");
        pupil1.displayInfo();
        pupil2.displayInfo();
        pupil3.displayInfo();
        System.out.println("\n");

        Student student1 = new Student("Rytikova", "Veronica", "Female", 18, "Engineering and Economics", "Business", 973901);
        Student student2 = new Student("Tobin","Egor",20,"Computer design","Mobile Systems",768097);
        Student student3 = new Student();
        System.out.println("Students: ");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        System.out.println("\n");

        Postgraduate postgraduate1 = new Postgraduate("Chilik","Pasha",24,"Price policy", "Arhipova Larisa");
        Postgraduate postgraduate2 = new Postgraduate("Zaretskaya", "Inna",26,"Software of vector graphics", "Atamanchyk Ekaterina Leonidovna");
        Postgraduate postgraduate3 = new Postgraduate();
        System.out.println("Postgraduates: ");
        postgraduate1.displayInfo();
        postgraduate2.displayInfo();
        postgraduate3.displayInfo();
        System.out.println("\n");
    }
}
