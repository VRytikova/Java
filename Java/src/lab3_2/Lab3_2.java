package lab3_2;

public class Lab3_2 {
    public static void main(String[] args) {
        Pupil pupil=new Pupil("Kozlov", "Egor",14,9,'b');
        Daily daily_student = new Daily("Rytikova", "Veronica", 18, "Engeneering and Economics", "Business", 973901, "Daily");
        ByCorrespondence correspondence_student = new ByCorrespondence("Pylnik","Marina", 18,"Engeneering and Economics", "Marketing", 974001, "By correspondence");
        Postgraduate postgraduate = new Postgraduate("Woron", "Zahar", 25,"Operating systems", "Korol Igor");
        pupil.printCategory();
        pupil.displayInfo();
        daily_student.printCategory();
        daily_student.displayInfo();
        correspondence_student.printCategory();
        correspondence_student.displayInfo();
        postgraduate.printCategory();
        postgraduate.displayInfo();
    }
}
