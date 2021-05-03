class Result{
    int Java, OS, DBMS;
    Result(int j, int o, int d){
        Java=j; OS=o; DBMS=d;
    }
    final int count(){
        return Java+OS+DBMS;
    }
}
public class subject {
    public static void main(String[] args) {
        Result v =new Result(98,54,97);
        System.out.println("Result is: "+v.count());
    }
}
