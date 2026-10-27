public class Dog extends Animal {
    public Dog(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating dog food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
