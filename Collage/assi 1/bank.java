import java.util.Scanner;
class bank {
    long accnum;
    String name;
    float balance=0;
    Scanner sc = new Scanner(System.in);

    public bank(long v, String n) {
        accnum = v;
        name = n;
    }

    public void depositMoney() {
        System.out.print("Enter amount you want to deposit: ");
        float amount = sc.nextFloat();
        this.balance +=amount;
    }

    public void withDrawMoney() {
        System.out.print("Enter the amount U want to withDraw: ");
        float amount = sc.nextFloat();
        if(amount>this.balance) 
            System.out.println("Insufficient amount to withdraw.");
        else
            this.balance -= amount;
    }

    public void showbalance() {
        System.out.println("Acount & Ballance info:");
        System.out.println("Acount No:"+this.accnum);
        System.out.println("Name:"+this.name);
        System.out.println("Ballance:"+this.balance);
        System.out.println(" ");         
    }

    public static void main(String[] args) {
        bank ac1 = new bank(1, "vraj");
        bank ac2 = new bank(2, "sivu");
        ac1.depositMoney();
        ac1.withDrawMoney();
        ac2.depositMoney();
        ac2.withDrawMoney();
        ac1.showbalance();
        ac2.showbalance();
    }
}

