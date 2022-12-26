import java.util.*;
public class ProductAb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int product=a*b;
        System.out.println("Product is:" +product);

    }
}
