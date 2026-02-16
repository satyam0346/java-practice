import java.util.Scanner;
public class Fibonacci {
    public static void main(String [] args){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0, b = 1;

        if(n>=1 && n<=30) {

            for (int i = 1; i <= n; i++){
                System.out.print(a + " ");

                int c = a + b;
                a = b;
                b = c;
            }
        }else {
            System.out.println("Enter Correct Number");
        }    
    }
}