package trial;


import sun.net.www.ApplicationLaunchException;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(8);
        Apple apple12= new Apple(6);

        System.out.println(apple1.equals(apple12));
    }
}


