import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("enter the number you want to print multiplication table");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("multiplication table in normal order: \n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }

        System.out.println("\n multiplication table in reverse order: \n");
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
        sc.close();
    }
}
