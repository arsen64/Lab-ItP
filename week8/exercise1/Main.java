public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Cow("Burenka", 140, 650, "black and white"),
            new Cat("Murzik", 25, 4.5, "gray"),
            new Dog("Sharik", 55, 20, "brown")
        };

        for (Animal a : animals) {
            System.out.println(a);
            a.eat();
            a.sleep();
            a.makeSound();
            System.out.println();
        }
    }
}
