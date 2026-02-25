import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        int [][] marks=new int[3][];
        marks[0]=new int[3];
        marks[1]=new int[2];
        marks[2]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("student class "+i+" and marks "+j);
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("marks are maintained in: ");
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
