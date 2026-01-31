
public class bin {
    public static int bsearch(int numbers[], int key){
        //make sure to make the start and end in binay search 
        int start = 0;
        int end = numbers.length -1;

        while(start <= end){
            int mid = (start+end)/2;
            //compare mid with key
            if(numbers[mid] == key){//found
                return mid;
            }
            if(numbers[mid] < key ){//right
                start = mid +1;
            }else{//left
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 13;

        System.out.println("index for key is: "+bsearch(numbers, key));
    }    
}
// time complexity: O(log n)
