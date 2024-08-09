import java.util.Scanner;

public class Currency {

    static float dollarToRupees(float m){
        return m * 83.99f;
    }

    static float rupeesToDollar(float m){
        return m / 83.99f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        float a = sc.nextFloat();
        sc.nextLine();  // Consume the leftover newline character
        System.out.println("Choose what you want to do:");
        System.out.println("dtr: for Dollar to Rupees.");
        System.out.println("rtd: for Rupees to Dollar.");
        String choice = sc.nextLine();

        if (choice.equals("dtr")) {
            a = dollarToRupees(a);
            System.out.println("Rupees: " + a);
        } else if (choice.equals("rtd")) {
            a = rupeesToDollar(a);
            System.out.println("Dollars: " + a);
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
