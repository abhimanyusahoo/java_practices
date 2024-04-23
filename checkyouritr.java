import java.util.Scanner;


public class checkyouritr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this helps you to calculate your income tax returns.");
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("hello! "+name +", Please, enter your annual income to calcuate your income tax returns. ");
        int income = sc.nextInt();
        if (income <= 250000) {
            System.out.println("you are not eligible for income tax returns.");
        }else if (income>250000 && income<=500000) {
            System.out.println("your income tax return is 5% which is :" +income*5/100 );
        }else if (income>500000 && income<=1000000) {
            System.out.println("your income tax return is 20% which is :" +income*20/100);
        }else if (income>1000000) {
            System.out.println("your income tax return is 30% which is :" +income*30/100);
        }
        System.out.println("Thanks! For helping in creating a better nation.");
        sc.close();
    }
}
