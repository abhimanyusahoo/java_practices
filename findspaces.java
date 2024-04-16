import java.util.Scanner;

public class findspaces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("enter the space to find out it's position");;
        String space=sc.nextLine();
        int pos=str.indexOf(space);
        System.out.println("the position of the space is "+pos);
    }
}
