import java.util.*;
public class LargestOfThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();

        //logic starts from here

        if(a>b){
            if(a>c){
                System.out.println("greater number is:"+ a);
            }
            else{
                System.out.println("greater number is:"+ c);
            }
        }
        else if(b>c){
                
            System.out.println("greater number is:"+ b);
        }
        else{
            System.out.println("greater number is:"+ c);
        }

    }
    
}
