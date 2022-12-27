import java.util.*;
public class Primefun {
    public static boolean prime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt();
        sc.close();
        if(prime(num)){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Its not a prime number");
        }
    }
    
}
