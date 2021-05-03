
class person {
    int id, age;
    String name;

    person(int i, String n) {
        id = i;
        name = n;
    }

    person(int i, String n, int a) {
        id = i;
        age = a;
        name = n;
    }

    void display() {
        System.out.println("Student id: " + id);
        System.out.println("Student Age: " + age);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        person p1 = new person(54001, "Vraj");
        person p2 = new person(54002, "Sivu", 02);
        p1.display();
        p2.display();
    }
}
