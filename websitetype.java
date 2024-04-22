import java.util.Scanner;


public class websitetype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("this program will help you to findout the type of website it is that you have entered.");
        System.out.println("enter the website name");
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("this is a commercial website");
        }else if (website.endsWith(".shop")) {
            System.out.println("this is a shopping website");
        }else if (website.endsWith(".edu")) {
            System.out.println("this is a educational website");
        }else if (website.endsWith(".org")) {
            System.out.println("this is a organization website");
        }else if (website.endsWith(".in")) {
            System.out.println("this is a indian website");
        }else {
            System.out.println("Sorry for the inconvinent.\n your entered website is not listed in this program.\n we will definitely update more website type in this program ");
        }
        sc.close();

    }
}
