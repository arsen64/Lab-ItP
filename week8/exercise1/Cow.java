public class Cow extends Animal {
    public Cow(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void eat() {
        System.out.println(name + " the cow is chewing grass.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Moo!");
    }
}
