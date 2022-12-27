import java.util.*;

public class nCrFun {

    public static int fact(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N and C");
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int ans = fact(n) / (fact(n - r) * fact(r));
        System.out.println(ans);
    }

}
