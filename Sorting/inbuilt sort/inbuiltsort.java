public class inbuiltsort {
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};

        // this is for assending order   
        // Arrays.sort(arr,0,3);
        //Arrays.sort(arr);

        //this is for Decending order  
        //Arrays.sort(arr,0,3,Collections.reverseOrder());
        //Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}

//time complexity = O(n log n) 