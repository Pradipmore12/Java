import java.util.*;
public class ArraysCC {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        //array declaration
        int marks[]=new int[30];

        //taking input of array elements
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        sc.close();

        //ouput the array elements

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);


    }

    
}
