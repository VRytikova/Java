package trial;

public class Apple extends Fruit {
    private int size;

    public Apple(int size) {
        this.size = size;
        System.out.println("Constructor of Apple");
    }

    @Override
    public void method() {
        System.out.println("Method of Apple");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "wjiogbrngjbo";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple apple = (Apple)obj;
            if (this.size > apple.size) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
