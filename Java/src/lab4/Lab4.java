package lab4;

import static lab4.Patient.*;

public class Lab4 {
    public static void main(String[] args) throws Exception {
        Patient patient[] = new Patient[3];
        for (int i = 0; i < 3; i++) {
            patient[i] = new Patient();
            patient[i].inFile();
        }
        outofFile();
        women(patient);
        file.deleteOnExit();
    }
}

