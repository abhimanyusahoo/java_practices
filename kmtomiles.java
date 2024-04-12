import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        // calculate miles
        double miles=km/1.609;
        
        System.out.printf("Distance in miles is : %.2f",miles); 
    }
}
