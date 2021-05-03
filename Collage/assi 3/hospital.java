class doctor{
    String name;
    doctor(String name){
        this.name = name;
    }
}

class surgeon extends doctor {
    String Specialization;
    int Charge;

    surgeon(String name, String Specialization, int Charge){
        super(name);
        this.Specialization = Specialization;
        this.Charge = Charge;
    }

    void Display() {
        System.out.println("Name: "+name);;
        System.out.println("Specialization : " + Specialization);
        System.out.println("Charge: "+Charge);
    }
}

class Physician extends doctor {
    String speciality;
    int fees;

    Physician(String name, String speciality, int fees) {
        super(name);
        this.speciality = speciality;
        this.fees = fees;
    }

    void Display() {
        System.out.println("Name: "+name);;
        System.out.println("Speciality : " + speciality);
        System.out.println("Fees: "+fees);
    }
}

class hospital {
    public static void main(String[] args) {
        surgeon v1 = new surgeon("Drx. Vishwa Patel","Pharmacist", 20000);
        surgeon v2 = new surgeon("Dr. Vraj Patel", "Cardiologist", 15000);
        surgeon v3 = new surgeon("Dr. Nrupa Patel", "Neurologist", 25000);        
        v1.Display();
        v2.Display();
        v3.Display();
    }
}
