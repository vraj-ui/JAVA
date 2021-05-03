import java.util.Vector;
class student {
    public static void main(String[] args) {
        Vector<String> student = new Vector<String>();
        student.insertElementAt("Mobile", 0);
        student.addElement("Laptop");
        student.addElement("Watch");
        student.addElement("Shoes");
        student.addElement("T-Shirt");
        student.addElement("Jeans");
        System.out.println("Befor removing jeans: ");
        System.out.println("Vector elements are: "+student);

        if(student.remove("Jeans"))
            System.out.println("After removing jeans");
            System.out.println("Vector removing jeans"+student);
    }    
}
