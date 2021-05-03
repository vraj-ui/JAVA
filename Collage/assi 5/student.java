
class student {
    int id, age;
    String name;

    student(int v, int a, String n) {
        id = v;
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Student id: " + id);
        System.out.println("Student Age:" + age);
        System.out.println("Student Name:" + name);
    }

    public static void main(String[] args) {
        student v = new student(54060, 18, "Vraj");
        student s = new student(54061, 18, "Sivu");
        v.display();
        s.display();
    }

}
