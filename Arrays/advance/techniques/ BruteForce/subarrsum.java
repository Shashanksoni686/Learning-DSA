//calculating maximum subarray sum.

// Using Brute Force Approach.

// Time Complexity: O(n^3).

public class subarrsum {
    public static void maxSubarraySum(int numbers[]){
        //calculating max sum subarray
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){ 
            int start = i; 
            for(int j=i;j<numbers.length;j++){   
            int end = j;
            currSum = 0;//resetting currSum for new subarray
            for(int k = start; k <= end; k++){
                //calculating max sum subarray
                currSum += numbers[k];
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum = currSum;
            }
            }
        }
        System.out.println("Maximum Subarray Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);//calling the function

    }
}
