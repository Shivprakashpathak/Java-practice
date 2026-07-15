import java.util.Scanner;

public class Fahren {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the temperature in F" );
        int fahrenhite  = scanner.nextInt();
        int celsius = (fahrenhite -  32) * 5/9;
        System.out.println("Temperature in celsiius is:" + celsius);
    }
}