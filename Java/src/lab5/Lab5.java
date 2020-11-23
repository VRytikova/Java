package lab5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Lab5 {
    public static void main(String[] args) throws Exception {
        Filework fw = new Filework();
        int key = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Menu\n"+"1 - Show info\n"+"2 - Add text\n"+"3 - Remove numbers from text\n"+"4 - Copy information"+"5 - Close fileStream");
            key = Integer.parseInt(in.readLine());
            switch (key) {
                case 1:
                    fw.displayInfo();
                    break;
                case 2:
                    System.out.println("1 - in the beginning\n"+"2 - in a middle\n"+"3 - in the end");
                    fw.redact();
                    break;
                case 3:
                    fw.deleteNumbers();
                    break;
                case 4:
                    fw.copy();
                    break;
                case 5:
                    fw.closeFile();
                default:
                    in.close();
                    exit(0);
            }
        }while(key>=1);
    }
}
