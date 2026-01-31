//Kadane's Algorithm to find the maximum subarray sum in an array.

public class subarrsum {
    // in case for all the negative numbers this algorithm will give the output as 0
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<numbers.length;i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm = "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4-1,-2,1,5,-3};
        kadane(numbers);

    }
}
// Time Complexity: O(n)