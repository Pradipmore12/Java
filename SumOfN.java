import java.util.*;
public class SumOfN {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of First "+num+"numbers is :"+sum);
    }
}
