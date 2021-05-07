package pra5.Shapes;

public class Rectangle implements Propery {
    public void color() {
        System.out.println("Color is Red.");
    }
    public void dimension() {
        System.out.println("Dimensions are A= L * B.");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.color();
        r.dimension();
    }
}
