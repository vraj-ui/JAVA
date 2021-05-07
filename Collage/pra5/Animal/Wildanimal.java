package pra5.Animal;

public class Wildanimal implements Animal {
    public void eat() {
        System.out.println("Eat method.");
    }

    public void travel() {
        System.out.println("Implementing travel method...");
    }

    public static void main(String[] args) {
        Wildanimal wa = new Wildanimal();
        System.out.println("Calling Eat Method.");
        wa.eat();

        System.out.println("Calling Travel Method.");
        wa.travel();
    }
}
