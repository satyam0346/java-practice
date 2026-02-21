
import java.util.Scanner;
public class Reporter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name?");
        String name = sc.nextLine();
        System.out.println("Enter Your Age?");
        int age = sc.nextInt();
        System.out.println("Your favourite programming language?");
        String lang = sc.nextLine();

        System.out.println("STUDENT DETAILS");
        System.out.println("Name:" + name);
        System.out.println("Age:" +age);
        System.out.println("Lang:" +lang);
    }
}
