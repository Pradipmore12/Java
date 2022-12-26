//import java.util.*;
public class spiralarray {
    public static void spiralmatrix(int matrix[][]) {
        int srtrow = 0;
        int srtcolm = 0;
        int endrow = matrix.length - 1;
        int endcolm = matrix.length - 1;

        while (srtrow <= endrow && srtcolm <= endcolm) {
            for (int j = srtcolm; j <= endcolm; j++) {
                System.out.print(matrix[srtrow][j] + " ");
            }
            srtrow++;

            for (int i = srtrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcolm] + " ");
            }
            endcolm--;
            for (int j = endcolm; j >= srtcolm; j--) {

                System.out.print(matrix[endrow][j] + " ");
            }
            endrow--;

            for (int i = endrow; i >= srtrow; i--) {

                System.out.print(matrix[i][srtcolm] + " ");
            }
            srtcolm++;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralmatrix(matrix);
    }
}
