import java.util.*;
public class BinToDec {
    public static boolean validBin(int num){
        while(num!=0){
            int digit=num%10;
            if(digit!=1 && digit!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }

    public static int dec(int num){
        int dec=0;
        int i=0;
        while(num!=0){
            int digit=num%10;
            dec+=digit*Math.pow(2,i);
            i++;
            num/=10;

        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary Number");
        int num=sc.nextInt();
        sc.close();
        if(validBin(num)){
            System.out.println("Decimal of "+num+" is :"+dec(num));

        }
        else{
            System.out.println("Enter a valid Binary Number");
        }
    }
    
}
