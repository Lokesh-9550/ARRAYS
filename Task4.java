import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        //3D Jagged Array
        int [][][] marks=new int[2][][];
        marks[0]=new int[2][];
        marks[1]=new int[3][];
        marks[0][0]=new int[3];
        marks[0][1]=new int[2];
        marks[1][0]=new int[1];
        marks[1][1]=new int[2];
        marks[1][2]=new int[3];
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<marks.length;i++){
        for(int j=0;j<marks[i].length;j++){
            for(int k=0;k<marks[i][j].length;k++){
                System.out.println("section "+i+" and class "+j+" student marks "+k);

                marks[i][j][k]=sc.nextInt();
            }
        }
       }
       System.out.println("marks are mentained in below: ");
       for(int i=0;i<marks.length;i++){
        for(int j=0;j<marks[i].length;j++){
            for(int k=0;k<marks[i][j].length;k++){
                System.out.print(marks[i][j][k]);
            }
            System.out.println();
        }
       }
    }
    
}
