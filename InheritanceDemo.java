interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Labrador extends Dog {
    void fetch() {
        System.out.println("Fetching the ball...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

class Duck extends Animal implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flying in the sky...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming in the pond...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Single & Multilevel Inheritance (Labrador) ---");
        Labrador lab = new Labrador();
        lab.eat();
        lab.bark();
        lab.fetch();

        System.out.println("\n--- Hierarchical Inheritance (Cat) ---");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("\n--- Multiple & Hybrid Inheritance (Duck) ---");
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }
}