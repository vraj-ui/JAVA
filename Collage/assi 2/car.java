class car {
    private String model, color, brand;
    void setData(String m, String c, String b) {
        model = m;
        color = c;
        brand = b;
    }
    void displaycarinfo() {
        System.out.println("Model:"+model);
        System.out.println("Color:"+color);
        System.out.println("Brand:"+brand);
    }
        public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car();
        car car3 = new car();
        car1.setData("City", "White", "Honda"); 
        car2.setData("Desire", "Red", "Maruti");
        car3.setData("XUV500", "Maroon", "Mahindra");
        System.out.println("car 1 info :");
        car1.displaycarinfo();
        System.out.println();
        System.out.println("car 2 info :");
        car2.displaycarinfo();
        System.out.println();
        System.out.println("car 3 info :");
        car3.displaycarinfo();
        }
}
