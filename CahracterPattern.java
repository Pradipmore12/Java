import java.util.*;

public class CahracterPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        // Code Logic Starts here

        char toPrint = 'A';
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(toPrint + " ");
                toPrint++;
            }
            System.out.println();
        }
    }
}
