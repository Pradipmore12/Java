import java.util.*;

public class hollowPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber of rows and cols:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == cols || j == 1 || i == 1 || i == rows) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
