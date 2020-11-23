package lab5;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Filework{
    static RandomAccessFile file = null;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public Filework() throws FileNotFoundException {
        this.file = new RandomAccessFile("C:\\Users\\User\\Documents\\Projects\\lab5.txt", "rw");
    }
     public void displayInfo() throws IOException {
        System.out.println("Information from file lab5.txt "+"\n");
        System.out.println(file.readLine());
     }

     public void redact() throws  Exception{
        int choice=0;
        choice = Integer.parseInt(in.readLine());
        switch (choice){
            case 1:
                file.seek(0);
                String s = in.readLine();
                file.writeBytes(s);
                break;
            case 2:
                file.seek(123);
                file.writeBytes(in.readLine());
                break;
            case 3:
                file.seek(file.length());
                file.writeBytes(in.readLine());
                break;
            default:
                break;
        }
     }

     public void deleteNumbers() throws IOException {
        file.seek(0);
         String edition = new String(file.readLine());
         edition = edition.replaceAll("[0-9]+","");
         System.out.println(edition);
         file.writeBytes(edition);
     }

     public void copy()throws IOException{
         file.seek(0);
         FileChannel previous = null;
         FileChannel new1 = null;
         previous = file.getChannel();
         new1 = new RandomAccessFile("C:\\Users\\User\\Documents\\Projects\\lab5new.txt", "rw").getChannel();
         new1.transferFrom(previous, 0, previous.size());
         previous.close();
         new1.close();
     }

     public void closeFile() throws IOException {
         file.close();
     }
}
