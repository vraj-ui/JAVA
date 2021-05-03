
class Animal {
    public void animalSound(String s) {
    }
}

class Pig extends Animal{
    String p;
    public void animalSound() {
        this.p = "Oink Oink";
        System.out.println("The pig saya: "+this.p); }
}

   class Cat extends Animal{
    String c;
    public void animalSound() {
        this.c = "Meouw";
        System.out.println("The Cat says: "+this.c);
    }
}

class Dog extends Animal{
    String d;
    public void animalSound() {
        this.d = "Bhau Bhau";
        System.out.println("The Dog says: "+this.d);
    }
}
   
class animalmethod {
    public static void main(String[] args) {
        Pig p = new Pig();
        Cat c = new Cat();
        Dog d = new Dog();
        p.animalSound();
        c.animalSound();
        d.animalSound();
    }
}
