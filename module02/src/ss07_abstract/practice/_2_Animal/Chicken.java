package ss07_abstract.practice._2_Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken cluck cluck.";
    }

    @Override
    public String howToEat() {
        return "Fry chicken.";
    }
}
