import java.util.Scanner;;

public class sumofn {
    public static void main(String[] args) {
        int n,result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            result +=i;
        }
        
        System.out.println("sum of " +n+ "natural numbers is " +result);

        sc.close();
    }

}
