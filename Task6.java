public class Task6 {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        //forEach
        for(int ele:arr){
            System.out.println(ele+" ");
        }
        System.out.println("************");

        int [][] arrTwo={{2,3,4,5},{6,7,8,9}};
        for(int []a:arrTwo){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    
    
}
