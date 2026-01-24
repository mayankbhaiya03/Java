class algebra {
    // CLASS LEVEL OF SCOPE
    int a = 2;
    int b = 4;

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    // METHOD LEVEL OF SCOPE
    int mul() {
        int p = 12;
        int q = 10;
        return p * q;
    }

    // BLOCK LEVEL OF SCOPE
    void demo() {
        int x = 5;
        System.out.println("value of x is" + x);
        // System.out.println(y); // ERROR: y cannot be resolved to a variable

        {
            int y = 10;
            System.out.println("value of y is" + y);
        }
        // System.out.println(y); // ERROR: y cannot be resolved to a variable
        {
            int y = 100;
            System.out.println("value of second y is" + y);
        }
    }

}

public class scope {
    public static void main(String[] args) {
        algebra obj = new algebra();
        obj.demo();

    }

}
