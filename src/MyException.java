public class MyException extends Exception{

    private int element;
    MyException(int org) {
        element = org;
    }
    public String toString() {
        return "MyException! " + element;
    }
}

