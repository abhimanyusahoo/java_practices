import java.util.Scanner;

public class changecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a String.");
        String s=sc.next();
        System.out.println("choose what operation you want to do :");
        System.out.println("tlc :for to lower case. \n tuc :for upper case.");
        String inPut= sc.next();
        if(inPut.equals("tlc")){
            System.out.println(s.toLowerCase());
            } else if (inPut.equals("tuc")){
            System.out.println(s.toUpperCase());
                }else{
            System.out.println("Please, input correct option");
        }
    }

}
