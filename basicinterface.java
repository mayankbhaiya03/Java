interface data {
    void call();// abstract method
}

public class basicinterface {
    public static void main(String[] args) {
        data d = new data2();
        d.call();
    }
}

class data2 implements data {
    public void call() {
        System.out.println("interface implemented");
    }

}
