import java.util.Scanner;
public class spacestounderscore {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentences:");
        String s=sc.nextLine();
        String s1=s.replaceAll(" ","_");
        System.out.println(s1);
    }
}
