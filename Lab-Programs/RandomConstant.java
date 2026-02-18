import java.util.Scanner;
import java.util.Random;

public class RandomConstant {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Random no = new Random();

        int n;

        System.out.println("Enter length of sequence: ");

        n =sc.nextInt();

        String letter = "BCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i< n; i++){
            int index = no.nextInt(letter.length());

            System.out.println("Random Sequence: " + letter.charAt(index));
        }

        sc.close();
        

    }
}
