abstract class animal {
    int runningspeed;
    String animalname;
    animal(int B, String C)
    {
        runningspeed= B;
        animalname= C;
    }
    abstract void display();
}

class Carnivorous extends animal {
    Carnivorous( int b, String c){
        super(b,c);
    }
    void display(){
        System.out.println("Speed of Carnivorous Animal " + animalname +" is "+runningspeed);
    }
}

class Vegetarian extends animal {
    Vegetarian(int b, String c){
        super(b,c);
    }
    void display(){
        System.out.println("Speed of Vegetarian Animal " + animalname +" is "+runningspeed);
    }
}
public class abstractanimal {
    public static void main(String[] args) {
        Carnivorous l = new Carnivorous (100,"LION"); 
        Vegetarian c = new Vegetarian (30,"COW"); 
        l.display(); 
        c.display();
    }
}
