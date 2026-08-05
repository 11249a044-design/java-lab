class Car {
    static int objectCount = 0;
    String modelName;

    Car(String modelName) {
        this.modelName = modelName;
        objectCount++;
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan");
        Car car2 = new Car("SUV");
        Car car3 = new Car("Hatchback");

        System.out.println("Total Car objects created: " + Car.objectCount);
    }
}