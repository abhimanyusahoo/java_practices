import java.util.Scanner;

/**
 *
 * @author abhimanyusahoo
 */

public class percalsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is a percentage calculator for different no of java.");
        System.out.println("Enter the no of subject:");
        int n = sc.nextInt();
        System.out.println("Enter the marks of each subject:");
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the mark for subject:" +i);
            marks[i] = sc.nextInt();
        }
        float sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + marks[i];
        }
        System.out.println("the total marks is:" +sum);
        float percentage = (sum/n);
        System.out.println("the total percentage is:" +percentage +"%");

        if (percentage>80) {
            System.out.println( "grade is A" );
        }else if (percentage>60) {
            System.out.println( "grade is  B" );
        } else if (percentage>50) {
            System.out.println( "grade is C" );
        } else if (percentage>=40) {
            System.out.println( "grade  is D" );
        } else if (percentage>33) {
            System.out.println( "grade is E" );
        }else{
            System.out.println( "fail grade F" );
        }




        sc.close();
    }
}
