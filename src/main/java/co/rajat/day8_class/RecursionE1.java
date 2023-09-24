package co.rajat.day8_class;

public class RecursionE1 {

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main (String[] args){
         System.err.println(fact(5));
    }
}
