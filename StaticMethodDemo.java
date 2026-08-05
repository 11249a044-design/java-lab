class MathUtility {
    static double pi;

    static {
        pi = 3.14159;
        System.out.println("Static block executed: MathUtility class loaded.");
    }

    static double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        double radius = 5.0;

        double area = MathUtility.calculateCircleArea(radius);

        System.out.println("Area of circle with radius " + radius + ": " + area);
    }
}