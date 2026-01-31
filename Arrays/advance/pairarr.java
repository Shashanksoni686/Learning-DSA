
// Print all the pairs of an array

//nested pair array using nested loops
public class pairarr {
    public static void pairing(int numbers[]){
        int totalpairs = 0;
        for(int i = 0; i<numbers.length;i++){
            int curr = numbers[i];//2,then4,then6....
            for(int j= i+1; j < numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+totalpairs);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        pairing(numbers);
    }
}


//formula for total pairs tp = n(n-1)/2 where n is the number of elements in the array.

//time complexity: O(n^2)