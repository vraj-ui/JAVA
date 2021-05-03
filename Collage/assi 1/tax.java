    import java.util.Scanner;

class tax {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Your Income: ");
        int amount = scan.nextInt();

        if (amount <=250000) 
            System.out.println("NIL");

        if(amount>=250000 && amount <=500000) 
            System.out.println("Amount to be paid is: Rs 12,500");
        
        if(amount>=500000 && amount <=750000) 
            System.out.println("Amount to be paid is: Rs 25,000 ");
        
        if(amount>=750000 && amount <=1000000) 
            System.out.println("Amount to be paid is: Rs"+amount);
        
        if(amount>=1000000 && amount <=1250000) 
            System.out.println("Amount to be paid is: Rs"+amount);
       
        if(amount>=1250000 && amount <=1500000) 
            System.out.println("Amount to be paid is: Rs"+amount);
        
        if(amount>=1500000) 
            System.out.println("Amount to be paid is: Rs"+amount);
        
     }
}

