import java.util.*;

public class StarPatternSimple {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
