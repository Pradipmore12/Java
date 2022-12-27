import java.util.*;
public class primeInRange {
    public static boolean prime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range A and B");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(prime(i)){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
    
}
