import java.util.*;
public class reverseNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int orNum=number;
        int reverse=0;
        while(number!=0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
        System.out.println("Reverse of "+orNum+"is :"+reverse);
    }
}
