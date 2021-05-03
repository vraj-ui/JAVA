abstract class shape {
    abstract void draw();
}

class Rectangle extends shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class circle extends shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

class testabstraction1 {
    public static void main(String[] args) {
        circle s = new circle();
        s.draw();
    }
}
