public class Animal {
    protected String name;
    protected double height; // cm
    protected double weight; // kg
    protected String color;

    public Animal(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes some sound.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name=" + name + ", height=" + height
                + " cm, weight=" + weight + " kg, color=" + color + "}";
    }
}
