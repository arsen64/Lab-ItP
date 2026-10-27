public class Cat extends Animal {
    public Cat(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void sleep() {
        System.out.println(name + " the cat is sleeping 16 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
