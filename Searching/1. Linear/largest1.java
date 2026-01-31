package Searching.linear;

public class largest1 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity, this is used to pick the smallest possible value initially.
        int smallest = Integer.MAX_VALUE; // +infinity, this is used to pick the largest possible value initially.
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("The Smallest number is: " + smallest);
        return largest;
    }
   public static void main(String[] args) {
       int numbers[] =  {1,2,6,3,5};
         System.out.println("The Largest number is: " + getLargest(numbers));
   } 
}
//tc=O(n) sc=O(1)
