
class demo {
    final int max_value = 99;

    void mymethod(){
        System.out.println("The max value: "+max_value);
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.mymethod();
    }
}
