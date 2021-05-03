import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base pay: ");
        double basepay = sc.nextDouble();
        
        System.out.print("Enter working hours per week: ");
        double hour = sc.nextDouble();
        double salary;
        
        if(hour > 60)
                System.out.println("Enter valid hours...");

        else if (basepay < 150)
            System.out.println("Enter base pay greater than 150...");

        else if (basepay <= 150)
            System.out.println("Enter valid basepay...");

        else{
            if(hour<=40)
                salary = 40 * basepay;
        else{
            salary = 40 * basepay;
            salary = salary +((hour-40)*(basepay*1.5));
        }
        
        System.out.println("Salary to be paid per week is Rs. "+salary);
        
        }
        sc.close();
    }
}
