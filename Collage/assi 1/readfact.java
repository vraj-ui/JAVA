import java.util.Scanner;
class readfact {
    public static void main(String[] args) {
        long num,i,fact=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
        for(i=num; i>0; i--)
        {
            fact = fact*i;
        }
        System.out.print("Factorial of " + num + " is " + fact);
    }
}
