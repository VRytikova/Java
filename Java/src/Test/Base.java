package Test;

public class Base {
    private int i = 5;
    public Base(){
        System.out.println("i= "+getI());
    }

    public int getI() {
        return i;
    }
}
