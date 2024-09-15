import java.util.Scanner;;


public class armstrong {
    public static void main(String[] args) {
        int n=0,openum,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        openum=num;
        while(openum!=0){
            openum/=10;
            n++;
        }

        openum=num;
        while(openum!=0){

            int power=1;

            for(int i=0;i<n;i++){
                power*=openum%10;
            }
            result+=power;
            openum/=10;
        }
        if(result==num){
            System.out.println(num+" is an Armstrong number");
        }else{
            System.out.println(num+" is not an Armstrong number");
        }

        sc.close();
    }
}
