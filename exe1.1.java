public class Hello {
    int instanceVar = 10;
    static String staticVar = "I am static";

    public void showVariables() {
        int localVar = 5;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Updated class reference from VariablesDemo to Hello
        Hello obj1 = new Hello();
        obj1.showVariables();
        
        System.out.println("Accessing Static Variable via class: " + Hello.staticVar);
    }
}