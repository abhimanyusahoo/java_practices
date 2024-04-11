import java.util.Scanner;


public class percal {
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);
        System.out.println("enter mark for sub1:");
        int m1 =mark.nextInt();
        System.out.println("enter mark for sub2:");
        int m2=mark.nextInt();
        System.out.println("enter mark for sub3:");
        int m3=mark.nextInt();
        System.out.println("enter mark for sub4:");
        int m4=mark.nextInt();
        System.out.println("enter mark for sub5:");
        int m5=mark.nextInt();
        float total=m1+m2+m3+m4+m5;
        System.out.println("total marks:"  +total);
        float percentage=total/5;
        System.out.println("percentage:" +percentage+"%");

        if (percentage>80) {
            System.out.println( "grade is A" );
        }else if (percentage>60) {
            System.out.println( "grade is  B" );
        } else if (percentage>50) {
            System.out.println( "grade is C" );
        } else if (percentage>=40) {
            System.out.println( "grade  is D" );
        } else if (percentage>30) {
            System.out.println( "grade is E" );
        }else{
            System.out.println( "fail grade F" );
        }

    }
}
