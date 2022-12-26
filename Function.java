import java.util.*;
public class Function {
    public static int Sum(int a,int b){
        return a+b;

    }
    public static void main(String args[]){
        //addition of two Numbers
        //take input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        System.out.println(Sum(a,b));
    }
    
}
