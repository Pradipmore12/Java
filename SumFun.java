import java.util.*;

public class SumFun {
    public static int printSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
        sc.close();
        System.out.println("Sum of " + num1 + " and " + num2 + " is :" + printSum(num1, num2));

    }

}
