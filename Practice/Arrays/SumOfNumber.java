import java.util.*;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int numbersArray [] = new int [n];


        System.out.println("Enter the Elements of Array:");
        
        for (int i = 0; i <n; i++){
            numbersArray[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i<n ; i++){
            sum = sum+numbersArray[i];
        }

        System.out.println("Sum of its element is; "+ sum);

        sc.close();

    }
    
}
