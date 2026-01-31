
import java.util.Scanner;

public class matrices {
    public static void largestandsmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("smallest:"+smallest);
    }



    public static void main(String args[]){
        int matrix[][]=new int [3][3];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();//for next line
        }
        largestandsmallest(matrix);1
    }
}
