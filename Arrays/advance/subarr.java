
// a continous part of array is called subarray.
public class subarr {
    public static void printSubArrays(int numbers[]){
        int totalsubarrays = 0;

        for(int i=0;i<numbers.length;i++){ //this is for starting point 
            int start = i; //this is to store starting point
            for(int j=i;j<numbers.length;j++){   //this is for ending point
            int end = j; //this is to store ending point
            for(int k = start; k <= end; k++){
                System.out.print(numbers[k]+" ");
            }
            totalsubarrays++;
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = "+totalsubarrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArrays(numbers);//calling the function
    }
}
