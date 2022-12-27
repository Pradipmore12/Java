import java.util.*;
public class FactorialFun {
    public static int fact(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for Finding out the factorial :");
        int num=sc.nextInt();
        sc.close();
        System.out.println("factorial of "+num+" is :"+fact(num));
    }
    
}
