import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Query");
        int a, b;
        int ans = 0;
        char op;
        a = sc.nextInt();
        op = sc.next().charAt(0);
        b = sc.nextInt();

        switch (op) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            case '%':
                ans = a % b;
                break;
            default:
                System.out.println("Enter valid operator");

        }
        System.out.print("= " + ans);

    }

}
