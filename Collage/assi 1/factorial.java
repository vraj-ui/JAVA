class factorial {
    public static void main(String[] args) {
        int i,factorial=1;
        int num=10;
        for(i=1;i<=num;i++) {
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+num+" is: "+factorial);
    }    
}
