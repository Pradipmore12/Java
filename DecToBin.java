import java.util.*;

public class DecToBin {
    public static int DecTobin(int num) {
        int q = 1, r, ans = 0, i = 0;
        while (q != 0) {
            q = num / 2;
            r = num % 2;
            num = q;
            ans = ans + r * (int) Math.pow(10, i);
            i++;
        }

        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println("Binary of " + number + " is :" + DecTobin(number));

    }

}
