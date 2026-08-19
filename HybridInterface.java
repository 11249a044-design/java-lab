interface A {
    void displayA();
}

interface B extends A {
    void displayB();
}

interface C {
    void displayC();
}

class D implements B, C {
    public void displayA() {
        System.out.println("Interface A");
    }

    public void displayB() {
        System.out.println("Interface B");
    }

    public void displayC() {
        System.out.println("Interface C");
    }
}

public class HybridInterface {
    public static void main(String[] args) {
        D obj = new D();

        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}