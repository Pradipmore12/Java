import java.util.*;
public class arrays2 {

    public static void update(int marks[]) {
        for(int i=0;i<marks.length;i++) {
            marks[i]=marks[i]+1;
        }
        return;
    }
    public static void main(String args[]){
        int marks[]=new int[3];
        marks[0]=90;
        marks[1]=50;
        marks[2]=70;

        update(marks);
        
        for(int i=0;i<marks.length;i++) {
            System.out.print(marks[i] + " ");
        }

    }
    
}
