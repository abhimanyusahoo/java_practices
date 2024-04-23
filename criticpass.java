import java.util.Scanner;


public class criticpass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is a enhanced method to check if the student is pass or fail. ");
        System.out.println("In this method the students have to secure 40% of mark in total and 33% of mark in each subject at least.");
        System.out.println("As it is a very critical method to check if the student is pass or fail so this named as criticpass.");
        System.out.println("Enter the marks of the student in each subject.");
        System.out.println("Enter the marks of the student in subject 1.");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of the student in subject 2.");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of the student in subject 3.");
        int sub3 = sc.nextInt();
        float avarage= (sub1+sub2+sub3)/3.0f;
        if(avarage>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("The student is pass.");
        }
        else{
            System.out.println("The student is fail.");
        }
        sc.close();
    }
}
