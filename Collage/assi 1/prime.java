import java.util.Scanner;
class prime {
    public static void main(String[] args) {
        Scanner p =new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int start = p.nextInt();
        System.out.print("Enter Second Number: ");
        int end = p.nextInt();
        System.out.print("Prime Numbers are between " +start + "and" + end);

        for (int i=start; i<=end;i ++ ) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
