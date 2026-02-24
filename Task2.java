import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        int [][] marks=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.println("Enter the class "+i+" and marks of student "+j);
                marks[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
