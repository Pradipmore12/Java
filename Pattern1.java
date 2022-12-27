import java.util.*;
public class Pattern1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    
}
