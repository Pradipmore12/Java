//Area of circle
import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float rad = sc.nextFloat();
        sc.close();
        float area = 3.14f * rad * rad;
        System.out.println("area of a circle is :" + area);

    }

}
