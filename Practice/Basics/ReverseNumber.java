import java.nio.ShortBuffer;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Your Number");
    int a = sc.nextInt();
    
    int unitd = a % 10;
    int temp_no = a - unitd;
    
    int tens = temp_no % 100;
    int tens_1 = tens /10;

    int temp_2 = temp_no - tens;

    int unit_fin = temp_2 / 100;

    int num = (unitd*100)+(tens_1*10)+(unit_fin);
    System.out.println(num);
}    
}
