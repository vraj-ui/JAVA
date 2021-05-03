import java.util.Scanner;

class bmi {
    float weight=0;
    float height=0;
    Scanner sc = new Scanner(System.in);

    public bmi(float w, float h) {
        weight = w;
        height = h;
    }

    public bmi(int w, String h) {
    }
    
    public void weight()  {
        System.out.print("Enter your weight in kg: ");
        float personweight = sc.nextFloat();
        weight +=personweight;
    }

    public void height() {
        System.out.print("Enter your height in meter: ");
        float personheight = sc.nextFloat();
        height += personheight;
    }

    public void bmi() {
        float bmi = weight*height;

        if(bmi<=18.9) 
            System.out.print("You'r Body 'Underweight'");

        if(bmi>19.0 && bmi<=24.9) 
            System.out.println("You'r Body 'Normal'");

        if(bmi>25.0 && bmi<=29.9)
            System.out.println("You'r Body 'Overweight'");

        if(bmi>=30.0)
            System.out.println("You'r Body is 'Obese'");
    }
    
    public static void main(String[] args) {
        bmi p1 = new bmi(1, "vraj");
        bmi p2 = new bmi(2, "sivu");
        p1.weight();
        p1.height();
        p1.bmi();
        p2.weight();
        p2.height();
        p2.bmi();
    }
}

