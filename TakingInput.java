import java.util.*;
public class TakingInput {
    public static void main(String args[]){
        System.out.println("Enter your name");
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        sc.close();
        System.out.println("Your name  is:" + name);
    }
    
}
