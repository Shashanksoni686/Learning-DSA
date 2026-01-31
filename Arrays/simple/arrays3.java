package simple;

public class arrays3 {
    public static void update(int marks[],int nonchangable){
        nonchangable = 50;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {85, 90, 78};//array is passed by reference so it can be changed inside function. 
        int nonchangable = 100;//this follows pass by vale so it cannot be changed inside function.
        update(marks,nonchangable);
        System.out.println("The value of nonchangable is: " + nonchangable);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
