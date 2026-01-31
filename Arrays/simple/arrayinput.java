package Arrays.simple;
import java.util.Scanner;
public class arrayinput {
    public static void main(String[] args){
        int marks[] = new int[100];
        //100 is the length of the array.

        Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();//phy
        // marks[1] = sc.nextInt();//chem
        // marks[2] = sc.nextInt();//maths

        System.out.println("Length of array: "+marks.length);//100

        // System.out.println("phy: "+marks[0]);
        // System.out.println("chem: "+marks[1]);
        // System.out.println("math: "+marks[2]);
        
        // javac file name.java is used to compile the java code.


        // marks[2] = 100;//updating marks in maths
        // System.out.println("updated marks of math: "+marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("percentage: "+percentage+"%");
    }
}
